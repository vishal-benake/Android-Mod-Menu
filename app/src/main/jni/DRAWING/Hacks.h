//
// Create by Ccaster on 30/05/2021
//
#ifndef PUT_CHEATS_CANVAS_DRAWING_H
#define PUT_CHEATS_CANVAS_DRAWING_H
#include "support.h"
#include "init.h"
#include "import.h"
#include "Memory.h"
#include "Process.h"
#include "Color.h"
#include "Config.h"
#include <thread>
#include <sys/uio.h>
#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include <thread>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>
#include <dirent.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <sys/syscall.h>
#include <unistd.h>
#include <sys/uio.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <errno.h>
#include <stdio.h>
#include <sys/un.h>
#include <time.h>
#include <ctype.h>
#include <iostream>

Color colorShootEnemy = Color::Red();
Color colorSeekbarAimbotRange = Color::Red();

Response response{};
char weaponData[100];	
char VehicleName[50];
char extra[30];
char ItemName[50];
char PlayerNameByte[100];
char PlayerNation[100];
char PlayerUID[100];
char loaded[1000], loadedpn[20];
char name[100];
int type = 69;
int myteamID = 101;
int TeamID;
float Health;
float x, y;
float Distance;
bool isBot;
Vector3 HeadLocation;
PlayerWeapon Weapon;
PlayerBone Bone;
kaddr pBase;
kaddr GWorld = 0, GNames = 0, ViewWorld = 0;
kaddr getMatrix;
kaddr getEntityAddr;
int botCount,playerCount,grenadeCount;
Color clr, clrHealth, _colorByDistance;
Vector3 Location;

#define PI 3.141592653589793238
char *getNameByte(kaddr address)
{
	char static lj[64];
	memset(lj, 0, 64);
	unsigned short int nameI[32];
	pvm(address, nameI, sizeof(nameI));
	char s[10];
	int i;
	for (i = 0; i < 32; i++)
	{
		if (nameI[i] == 0)
			break;
		sprintf(s, "%d:", nameI[i]);
		strcat(lj, s);
	}
	lj[63] = '\0';

	return lj;
}

PlayerBone getPlayerBone(uintptr_t pBase, struct D3DMatrix viewMatrix)
{
	PlayerBone b;
	b.isBone = true;
	struct D3DMatrix oMatrix;
	kaddr boneAddr = getPtr(pBase + 0x320);
	struct D3DMatrix baseMatrix = getOMatrix(boneAddr + 0x150);
	int bones[] = { 6, 5, 2, 12, 33, 13, 34, 64, 63, 53, 57, 54, 58, 55, 59 };
	boneAddr = getPtr(boneAddr + 0x5b0);
	// neck 0
	oMatrix = getOMatrix(boneAddr + (bones[0]) * 48);
	b.neck = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// cheast 1
	oMatrix = getOMatrix(boneAddr + (bones[1]) * 48);
	b.cheast = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// pelvis 2
	oMatrix = getOMatrix(boneAddr + (bones[2]) * 48);
	b.pelvis = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// lSh 3
	oMatrix = getOMatrix(boneAddr + (bones[3]) * 48);
	b.lSh = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// rSh 4
	oMatrix = getOMatrix(boneAddr + (bones[4]) * 48);
	b.rSh = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// lElb 5
	oMatrix = getOMatrix(boneAddr + (bones[5]) * 48);
	b.lElb = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// rElb 6
	oMatrix = getOMatrix(boneAddr + (bones[6]) * 48);
	b.rElb = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// lWr 7
	oMatrix = getOMatrix(boneAddr + (bones[7]) * 48);
	b.lWr = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// rWr 8
	oMatrix = getOMatrix(boneAddr + (bones[8]) * 48);
	b.rWr = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// lTh 9
	oMatrix = getOMatrix(boneAddr + (bones[9]) * 48);
	b.lTh = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// rTh 10
	oMatrix = getOMatrix(boneAddr + (bones[10]) * 48);
	b.rTh = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// lKn 11
	oMatrix = getOMatrix(boneAddr + (bones[11]) * 48);
	b.lKn = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// rKn 12
	oMatrix = getOMatrix(boneAddr + (bones[12]) * 48);
	b.rKn = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// lAn 13 
	oMatrix = getOMatrix(boneAddr + (bones[13]) * 48);
	b.lAn = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));
	// rAn 14
	oMatrix = getOMatrix(boneAddr + (bones[14]) * 48);
	b.rAn = World2ScreenMain(viewMatrix, mat2Cord(oMatrix, baseMatrix));

	return b;
}
PlayerWeapon getPlayerWeapon(uintptr_t base) {
	PlayerWeapon p;
	uintptr_t addr[3];
	pvm(getA(base + 0x140), addr, sizeof(addr)); //Actor*[] Children;//[Offset: 0x

	if (isValid32(addr[0]) && getI(addr[0] + 0xec) == 2) {
		p.isWeapon = true;
		p.id = getI(getA(addr[0] + 0x544) + 0xd8);
		p.ammo = getI(addr[0] + 0x970); //int CurBulletNumInClip;//[Offset: 0x
//		p.maxammo = getI(addr[0] + 0x984); //CurMaxBulletNumInOneClip;
	}
	else if (isValid32(addr[1]) && getI(addr[1] + 0xec) == 2) {
		p.isWeapon = true;
		p.id = getI(getA(addr[1] + 0x544) + 0xd8);
		p.ammo = getI(addr[1] + 0x970);
//		p.maxammo = getI(addr[0] + 0x984);
	}
	else if (isValid32(addr[2]) && getI(addr[2] + 0xec) == 2) {
		p.isWeapon = true;
		p.id = getI(getA(addr[2] + 0x544) + 0xd8);
		p.ammo = getI(addr[2] + 0x970);
//		p.maxammo = getI(addr[0] + 0x984);
	}

	return p;
}
kaddr getbsaddr(int pid)
{
	FILE *fp;
	uintptr_t addr = 0;
	char filename[40], buffer[1024];
	snprintf(filename, sizeof(filename), "/proc/%d/maps", pid);
	fp = fopen(filename, "rt");
	if (fp != NULL)
	{
		while (fgets(buffer, sizeof(buffer), fp))
		{
			if (strstr(buffer, "libUE4.so"))
			{
				addr = (uintptr_t) strtoul(buffer, NULL, 16);
				break;
			}
		}
		fclose(fp);
	}
	return addr;
}



void p_write(uintptr_t address, void* buffer, int size) {
    struct iovec local[1];
    struct iovec remote[1];

    local[0].iov_base = (void*)buffer;
    local[0].iov_len = size;
    remote[0].iov_base = (void*)address;
    remote[0].iov_len = size;

    process_vm_writev(target_pid, local, 1, remote, 1, 0);
}
Vector2 getPointingAngle(Vector3 camera, Vector3 xyz, float distance)
{
    Vector2 PointingAngle;
    float ytime = distance / 88000;

    xyz.Z = xyz.Z + 360 * ytime * ytime;

    float zbcx = xyz.X - camera.X;
    float zbcy = xyz.Y - camera.Y;
    float zbcz = xyz.Z - camera.Z;
    PointingAngle.Y = atan2(zbcy, zbcx) * 180 / PI; // 57.3
    PointingAngle.X = atan2(zbcz, sqrt(zbcx * zbcx + zbcy * zbcy)) * 180 / PI;

    return PointingAngle;

}

Options options
{
1, 0, 3, false, 1, false, 201};
bool isInCenter(Rect box,int screenWidth,int screenHeight){
                Vec22 centerPos = Vec22(screenWidth / 2, screenHeight / 2);
                if(box.x <centerPos.x && box.y <centerPos.y){
               return true;
}
               return false;
}void DrawESP(ESP esp, int screenWidth, int screenHeight) {
	response.Success = false;		  
	botCount = 0; 
    playerCount = 0; 
    grenadeCount = 0;
    struct Vector3 exyz;
    struct D3DMatrix vMat;
	struct Vector3 xyz;
	Vector2 pointingAngle;
	bool aimbot = false;
    bool aimKnoced = false;
    bool tracingStatus = true;		
	
    uintptr_t yawPitch = 0;
    uintptr_t enAddrPntr;
	uintptr_t aimatRecord = 0;		
	
	float aimRadius = 0;
    int openMirror;		
    int fire;						   
    int aimbotmode = 1;		//Head		
    int openState = 1;				
    int aimingState = 3;	//Fire + Scope		
    
    int priority = 1;	//CrosaHair			
    int pour = 0;				
    int aimingRange = 0;			
	int firing = 0;
	int ads = 0;
    int aimFor = 1;
    int aimBy = 1;
    int aimWhen = 3;  
	//int setui = 0;
	//setui = options.deptrai;
    aimRadius = (float)options.aimingRange;
    aimFor = options.aimbotmode;
    aimbot = options.openState == 0;
    aimWhen = options.aimingState;
    aimBy = options.priority;
    aimKnoced = options.pour;
	
 target_pid = find_pid("com.pubg.imobile");
	GNames = 0x742D894;
    GWorld = 0x7172AFC;
    ViewWorld = 0x76085A0;
        if (target_pid == 0) {
        return;
	}
	getMatrix = getPtr(getPtr(libbase + ViewWorld) + 0x68);
	libbase = getbsaddr(target_pid);
	kaddr vMatrix = getMatrix;
	kaddr cLoc = vMatrix + 0x6c0;   
	kaddr fovPntr = vMatrix + 0x5d0;   
    vMatrix = vMatrix + 0x6d0;   
    kaddr gname_buff[30];
	kaddr gname = getPtr(libbase + GNames);
	pvm(gname, &gname_buff, sizeof(gname_buff));
    float textsize=screenHeight/50;
    height = screenHeight; width = screenWidth;   
    kaddr getEntityAddr;
    getEntityAddr = getPtr(getPtr(libbase + GWorld) + 0x20) + 0x70;
	pvm(cLoc, &xyz, sizeof(xyz));
        if ((xyz.Z == 88.441124f || xyz.X == 0 || xyz.Z == 5278.43f || xyz.Z == 88.440918f) && !isBeta)
        {
        }  	
	pvm(fovPntr, & response.fov, 4);  
    pvm(vMatrix, &vMat, sizeof(vMat));
    enAddrPntr = getEntityAddr;
	Ulevel ulevel;
    pvm(enAddrPntr, &ulevel, sizeof(ulevel));
    
    if (ulevel.size < 1 || ulevel.size > 0x1000 || !isValid32(ulevel.addr)) {     
     }
        memset(loaded, 0, 1000);
        float nearest = -1.0f;
        firing = 0;
        ads = 0;
        for (int i = 0; i < ulevel.size; i++) {
            uintptr_t pBase = getPtr(ulevel.addr + i * SIZE);
            if (!isValid32(pBase))
                continue;
            if (getI(pBase + SIZE) != 8)
                continue;
            int ids = getI(pBase + 8 + 2 * SIZE);
            int page = ids / 0x4000;
            int index = ids % 0x4000;
            if (page < 1 || page>30)
                continue;
            if (gname_buff[page] == 0)
                gname_buff[page] = getA(gname + page * SIZE);
                strcpy(name, getText(getA(gname_buff[page] + index * SIZE)));
            if (strlen(name) < 5)
				continue;

            if (strstr(name, "BP_AirDropPlane_C") || strstr(name, "PlayerDeadInventoryBox_C") || strstr(name, "BP_AirDropBox_C")) {//Items
               char ItemName[50];
                pvm(getPtr(pBase + 0x14c) + 0x160, &exyz, sizeof(exyz));
                Location = World2Screen(vMat, exyz);
                if (Location.Z == 1.0f || Location.X > width + 100 || Location.X < -50)
                    continue;
                float screenW = (vMat._14 * exyz.X) + (vMat._24 * exyz.Y) + (vMat._34 * exyz.Z + vMat._44);
                Distance= (screenW / 100);
                strcpy(ItemName, name);
                if(Location.Z!=1.0f) {
                   esp.DrawItems(ItemName,Distance,Vec22(Location.X,Location.Y), itemSize);
               }}
         if (strstr(name, "Pickup_C") || strstr(name, "PickUp") || strstr(name, "BP_Ammo") || strstr(name, "BP_QK") || strstr(name, "Wrapper")) {//Items
               char ItemName[50];
               pvm(getPtr(pBase + 0x14c) + 0x160, &exyz, sizeof(exyz));
                Location = World2Screen(vMat, exyz);
                if (Location.Z == 1.0f || Location.X > width + 100 || Location.X < -50)
                    continue;
                float screenW = (vMat._14 * exyz.X) + (vMat._24 * exyz.Y) + (vMat._34 * exyz.Z + vMat._44);
                Distance= (screenW / 100);
                if (Distance > 200)
                        continue;
                strcpy(ItemName, name);
                 if(Location.Z!=1.0f) {
                   esp.DrawItems(ItemName,Distance,Vec22(Location.X,Location.Y), itemSize);
               }}
             if (strstr(name, "VH") || (strstr(name, "PickUp_") && !strstr(name, "BP")) || strstr(name, "Rony") || strstr(name, "Mirado") || strstr(name, "LadaNiva") || strstr(name, "AquaRail")) {//Vehicle
                char VehicleName[50];
                pvm(getPtr(pBase + 0x14c) + 0x160, &exyz, sizeof(exyz));
                Location = World2Screen(vMat, exyz);
                if (Location.Z == 1.0f || Location.X > width + 200 || Location.X < -200)
                    continue;
                Distance= getDistance(xyz, exyz);
                strcpy(VehicleName, name);
             if(Location.Z!=1.0f) {
                esp.DrawVehicles(VehicleName,Distance,Vec22(Location.X,Location.Y),vehicleSize);
                                             }}
        if (strstr(name, "BP_Grenade_Shoulei_C") || strstr(name, "BP_Grenade_Burn_C") || strstr(name, "BP_Grenade_Stun_C") || strstr(name, "BP_Grenade_Smoke_C"))   // Grenade                                                                                        // Warning
        {                       // Grenade Warning
            pvm(getPtr(pBase + 0x14c) + 0x150, &exyz, sizeof(exyz));
            Location = World2Screen(vMat, exyz);
            Distance= getDistance(xyz, exyz);
            if (Distance > 200)
                continue;
            if (strstr(name, "Shoulei"))
                type = 1;
            else if (strstr(name, "Burn"))
                type = 2;
            else if (strstr(name, "Stun"))
                type = 3;
            else if (strstr(name, "Smoke"))
                type = 4;
            if (!isGrenadeWarning)
                continue;
            esp.DrawText(Color(255, 0, 0), "WARNING THERE IS THROWABLE NEAR YOU  ",
                         Vec22(screenWidth / 2, 170), 30);
            if (Location.Z == 1.0f || Location.X > width + 100 || Location.X < -50)
               //continue;
            {
           if (type == 1)
                sprintf(extra, "Granade [%0.0fM] ", Distance);
                esp.DrawText(Color(255, 0, 0), extra,
                Vec22(Location.X, Location.Y), textsize);
                esp.DrawLine(RGBBoy(), screenHeight / 800,
                Vec22(screenWidth / 2, screenHeight / 500.5 + 0), Vec22(Location.X, Location.Y));
                esp.DrawCircle2(RGBBoy(), Vec22(Location.X, Location.Y), 10);
            }
           else if (type == 2)
            {
                sprintf(extra, "Molotov [%0.0fM] ", Distance);
                esp.DrawText(Color(157, 43, 34), extra, 
                Vec22(Location.X, Location.Y), textsize);
                esp.DrawLine(RGBBoy(), screenHeight / 800,
                Vec22(screenWidth / 2, screenHeight / 500.5 + 0), Vec22(Location.X, Location.Y));
                esp.DrawCircle2(RGBBoy(), Vec22(Location.X, Location.Y), 6);
            }
          else if (type == 3)
            {
                sprintf(extra, " Stun [%0.0fM] ", Distance);
                esp.DrawText(Color(255, 100, 0, 255), extra, 
                Vec22(Location.X, Location.Y), textsize);
                esp.DrawLine(RGBBoy(), screenHeight / 800,
                Vec22(screenWidth / 2, screenHeight / 500.5 + 0), Vec22(Location.X, Location.Y));
                esp.DrawCircle2(RGBBoy(), Vec22(Location.X, Location.Y), 6);
            }
           else if (type == 4)
            {
                sprintf(extra, "Smoke [%0.0fM] ", Distance);
                esp.DrawText(Color(0, 255, 0), extra, 
                Vec22(Location.X, Location.Y), textsize);
                esp.DrawLine(RGBBoy(), screenHeight / 800,
                Vec22(screenWidth / 2, screenHeight / 500.5 + 0), Vec22(Location.X, Location.Y));
                esp.DrawCircle2(RGBBoy(), Vec22(Location.X, Location.Y), 6);
            }
		}         
            if (strstr(name, "BP_PlayerPawn")){
				sprintf(loadedpn, "%lx,", pBase);

				int oType = getI(pBase + 0x70);
				
			
				if (getI(pBase + 0x964))
					continue;
                    
				pvm(pBase + 0x928, healthbuff, sizeof(healthbuff));
				if (healthbuff[1] > 200.0f || healthbuff[1] < 50.0f || healthbuff[0]>healthbuff[1] || healthbuff[0] < 0.0f)
					continue;                			
                
				Health = healthbuff[0] / healthbuff[1] * 100;

				TeamID = getI(pBase + 0x670);                          
				//me
				uintptr_t me = getI(pBase + 0xf8);
                
                if (me == 258) {
                    
             if (aimbot) {
                yawPitch = getA(pBase + 0x2fc /*Class: Pawn.Actor.Object to Controller* Controller Update 1.4 0x2ec*/) + 0x2f8/*Class: Controller.Actor.Object to Rotator ControlRotation update 1.4 0x2e8*/;
             if (aimWhen == 3 || aimWhen == 2)
                 pvm(pBase + 0xe21, &firing, 1); //bool bIsWeaponFiring; update 0xdf0
             if (aimWhen == 3 || aimWhen == 1)
                 pvm(pBase + 0xa99, &ads, 1); //bool bIsGunADS; update 0xa89
}
                    myteamID = TeamID;
                    continue;
                }
                else if (me != 257)
                    continue;

                if (TeamID == myteamID && myteamID <= 100)
                    continue;               

				pvm(getA(pBase + 0x285C) + 0x104, &exyz, sizeof(exyz));

				HeadLocation = World2Screen(vMat, exyz);

				Distance = getDistance(xyz, exyz);
				if (Distance > 600.0f)
					continue;
				pvm(pBase + 0x6e8, &isBot, sizeof(isBot));
				strcpy(PlayerNameByte, "66:111:116:");
                strcpy(PlayerNation, "69:999:000:");
                strcpy(PlayerUID, "66:111:116:");
				
				if (HeadLocation.Z != 1.0f && HeadLocation.X < width + 100 && HeadLocation.X > -50) {
				Bone = getPlayerBone(pBase, vMat);
				Weapon = getPlayerWeapon(pBase);
					if (!isBot) {
						//if (isPremium)
							
						strcpy(PlayerNameByte, getNameByte(getA(pBase + 0x648)));
                        strcpy(PlayerNation, getNameByte(getA(pBase + 0x654)));
                        strcpy(PlayerUID, getNameByte(getA(pBase + 0x664)));	
						
						
						if (strlen(PlayerNameByte) < 4)
							continue;				     
				    	if (strlen(PlayerNation) < 4)
							continue;
						if (strlen(PlayerUID) < 4)
							continue;	
					     }					 
				
               }		
            
	   if (HeadLocation.Z != 1.0f && (aimKnoced || Health > 0) && aimbot) {
             float centerDist = sqrt((HeadLocation.X - width / 2) * (HeadLocation.X - width / 2) + (HeadLocation.Y - height / 2) * (HeadLocation.Y - height / 2));
             if (centerDist < aimRadius) {
             if (aimBy != 1)
             centerDist = Distance;
             if (nearest > centerDist || nearest < 0) {


             nearest = centerDist;
             if (aimFor == 1)
             pointingAngle = getPointingAngle(xyz, exyz, Distance);
             else if (aimFor == 2) {

                               uintptr_t boneAddr = getA(pBase + 0x320);   //SkeletalMeshComponent*
                                struct D3DMatrix baseMatrix = getOMatrix(boneAddr + 0x150);
                                boneAddr = getA(boneAddr + 0x5b0);
                                struct D3DMatrix oMatrix = getOMatrix(boneAddr + 4 * 48);
                                pointingAngle = getPointingAngle(xyz, mat2Cord(oMatrix, baseMatrix), Distance);
                            }
                            else {
                                uintptr_t boneAddr = getA(pBase + 0x320);   //SkeletalMeshComponent*
                                struct D3DMatrix baseMatrix = getOMatrix(boneAddr + 0x150);
                                boneAddr = getA(boneAddr + 0x5b0);
                                struct D3DMatrix oMatrix = getOMatrix(boneAddr + 2 * 48);
                                pointingAngle = getPointingAngle(xyz, mat2Cord(oMatrix, baseMatrix), Distance);
                            }
                          if (aimFor == 3) {                     
                                uintptr_t boneAddr = getA(pBase + 0x320);   //SkeletalMeshComponent*
                                struct D3DMatrix baseMatrix = getOMatrix(boneAddr + 0x150);
                                boneAddr = getA(boneAddr + 0x5b0);
                                struct D3DMatrix oMatrix = getOMatrix(boneAddr + 12 * 48);
                                pointingAngle = getPointingAngle(xyz, mat2Cord(oMatrix, baseMatrix), Distance);
                            }
                            else if (aimFor == 4)  {
                                uintptr_t boneAddr = getA(pBase + 0x320);   //SkeletalMeshComponent*
                                struct D3DMatrix baseMatrix = getOMatrix(boneAddr + 0x150);
                                boneAddr = getA(boneAddr + 0x5b0);
                                struct D3DMatrix oMatrix = getOMatrix(boneAddr + 59 * 48);
                                pointingAngle = getPointingAngle(xyz, mat2Cord(oMatrix, baseMatrix),Distance);
                            }

                        }


                    }

                
                }
             if ((firing || ads) && nearest > 0) {
                 p_write(yawPitch, &pointingAngle, 8);//8
                }
		    
            if (isBot) {
                    _colorByDistance;
                } else {
                    _colorByDistance;
                }
               
                if (isBot) {
                    botCount++;
                } else {
                    playerCount++;
					clr.r = 0;
                    clr.g = 232;
                    clr.b = 0;
                    clr.a = 255;
                }
                         
                if(aimbot){
                if(options.openState==0)
				esp.DrawCircle(Color(0, 255, 0, 128),
                                                 Vec22(screenWidth/2,screenHeight/2),options.aimingRange,screenHeight/500);                           }
                x = HeadLocation.X; y = HeadLocation.Y;
			    Color _colorByDistance = colorByDistance((int)Distance, 255);
                float magic_number = (Distance);
                float mx = (screenWidth / 4) / magic_number;
                float my = (screenWidth / 1.38) / magic_number;
                float top = y - my + (screenWidth / 1.7) / magic_number;
                float bottom = y + my + screenHeight / 4 / magic_number;
/*                esp.DrawText(Color(0, 255, 0), "★[ᴄᴏᴅᴇ x ʟᴀʏᴇʀ]★",
                         Vec22(screenWidth / 2 / 2 / 2, screenHeight / 8), textsize);*/
              if (HeadLocation.Z != 1) {
              if (x > -50 && x < screenWidth + 50) {//onScreen
                    if (isSkelton1) {  //Skelton                         
                            esp.DrawLine(Color().White(), 6, Vec22(x, y),Vec22(Bone.neck.X,Bone.neck.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.neck.X,Bone.neck.Y),Vec22(Bone.cheast.X,Bone.cheast.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.cheast.X,Bone.cheast.Y),Vec22(Bone.pelvis.X,Bone.pelvis.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.neck.X,Bone.neck.Y),Vec22(Bone.lSh.X,Bone.lSh.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.neck.X,Bone.neck.Y),Vec22(Bone.rSh.X,Bone.rSh.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.lSh.X,Bone.lSh.Y),Vec22(Bone.lElb.X,Bone.lElb.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.rSh.X,Bone.rSh.Y),Vec22(Bone.rElb.X,Bone.rElb.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.lElb.X,Bone.lElb.Y),Vec22(Bone.lWr.X,Bone.lWr.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.rElb.X,Bone.rElb.Y),Vec22(Bone.rWr.X,Bone.rWr.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.pelvis.X,Bone.pelvis.Y),Vec22(Bone.lTh.X,Bone.lTh.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.pelvis.X,Bone.pelvis.Y),Vec22(Bone.rTh.X,Bone.rTh.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.lTh.X,Bone.lTh.Y),Vec22(Bone.lKn.X,Bone.lKn.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.rTh.X,Bone.rTh.Y),Vec22(Bone.rKn.X,Bone.rKn.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.lKn.X,Bone.lKn.Y),Vec22(Bone.lAn.X,Bone.lAn.Y));
                            esp.DrawLine(Color().White(), 6, Vec22(Bone.rKn.X,Bone.rKn.Y),Vec22(Bone.rAn.X,Bone.rAn.Y));
                        }
if (isPlayerBox)
{                  if ((screenWidth / 2) >= (x - mx) && (screenHeight / 2) >= (top) &&
                    (screenWidth / 2) <= (x + mx) && (screenHeight / 2) <= (bottom))
{                     if(isBot){
                            esp.DrawRect(Color(0, 255, 0), screenHeight / 500, Vec22(x - mx, top),
                               Vec22(x + mx, bottom));} else
{
                            esp.DrawRect(Color(255, 0, 0), screenHeight / 500, Vec22(x - mx, top),
                               Vec22(x + mx, bottom));
}
} else
{
if(isBot){
                            esp.DrawRect(Color(0,255,0), screenHeight / 500, Vec22(x - mx, top),
                                         Vec22(x + mx, bottom));}
else
{                            esp.DrawRect(Color(255, 255, 255), screenHeight / 500, Vec22(x - mx, top),
                                         Vec22(x + mx, bottom));
                                         }
                                         }
}
                    if (isPlayerHealth) {
                        float healthLength = screenWidth / 60;
                        if (healthLength < mx)
                            healthLength = mx;

                        if (Health < 25)
                            clrHealth = Color(255, 0, 0);
                        else if (Health < 50)
                            clrHealth = Color(255, 165, 0);
                        else if (Health < 75)
                            clrHealth = Color(255, 255, 0);
                        else
                            clrHealth = Color(0, 255, 0);
                        if (Health == 0)
                            esp.DrawTextNormal(Color(255, 0, 0), "Down",
                                         Vec22(x, top - screenHeight / 225), textsize);
                        else {
                            esp.DrawFilledRect(clrHealth,
                                               Vec22(x - healthLength, top - screenHeight / 110),
                                               Vec22(x - healthLength +
                                                    (2 * healthLength) *
                                                    Health / 100,
                                                    top - screenHeight / 225));

                            esp.DrawRect(Color(0, 0, 0), screenHeight / 660,
                                         Vec22(x - healthLength, top - screenHeight / 110),
                                         Vec22(x + healthLength, top - screenHeight / 225));
                        }
                    }
                        //Head
                        if (isPlayerHead)
                            esp.DrawFilledCircle(Color(255, 0, 0, 255),
                                                 Vec22(HeadLocation.X,
                                                      HeadLocation.Y),
                                                 screenHeight / 12 / magic_number);

                        //Name and distance
                        if (isPlayerName && Health != 0){
                            esp.DrawName(Color(255,255,255), PlayerNameByte,
                                         TeamID,
                                         Vec22(x, top - screenHeight / 60), textsize);
}
if(isPlayerName2)
                           	esp.DrawName2(Color().White(),PlayerNation, TeamID,
                                          Vec22(x+30, top - screenHeight / 60), textsize);	    
                        if (isPlayerDist && Health != 0) {
                            sprintf(extra, "%0.0f m", Distance);
                            esp.DrawTextNormal(Color(255, 255, 0), extra,
                                         Vec22(x, bottom + screenHeight / 60),
                                         textsize);
                        }
                                    
                            if (isEnemyWeapon && Weapon.isWeapon)
                            esp.DrawWeapon(Color(247, 244, 200), Weapon.id,
                                           Weapon.ammo,
                                           Vec22(x, bottom + screenHeight / 27), textsize);
                                         
                           }
                          }              				 
if (HeadLocation.Z == 1.0f) {
                if(!isr360Alert)
                    continue;
                if (y > screenHeight - screenHeight / 12)
                    y = screenHeight - screenHeight / 12;
                else if (y < screenHeight / 12)
                    y = screenHeight / 12;
                if (x < screenWidth / 2) {
                    esp.DrawFilledCircle(Color(255, 0, 0, 80),
                        Vec22(screenWidth, y),screenHeight / 18);
                    sprintf(extra, "%0.0f m", Distance);
                    esp.DrawTextAltert(Color(180, 250, 181, 200), extra,
                        Vec22(screenWidth - screenWidth / 80, y), textsize);
                } else {
                    esp.DrawFilledCircle(Color(255, 0, 0, 80),
                        Vec22(0, y),screenHeight / 18);
                    sprintf(extra, "%0.0f m", Distance);
                    esp.DrawTextAltert(Color(180, 250, 181, 200), extra,
                        Vec22(screenWidth / 80, y), textsize);
                }}
            else if (x < -screenWidth / 10 || x > screenWidth + screenWidth / 10) {
                if(!isr360Alert)
                    continue;
                if (y > screenHeight - screenHeight / 12)
                    y = screenHeight - screenHeight / 12;
                else if (y < screenHeight / 12)
                    y = screenHeight / 12;
                if (x > screenWidth / 2) {
                    esp.DrawFilledCircle(Color(255, 0, 0, 80),
                        Vec22(screenWidth, y),screenHeight / 18);
                    sprintf(extra, "%0.0f m", Distance);
                    esp.DrawTextAltert(Color(180, 250, 181, 200), extra,
                        Vec22(screenWidth - screenWidth / 80, y), textsize);
                } else {
                    esp.DrawFilledCircle(Color(255, 0, 0, 80),
                        Vec22(0, y),screenHeight / 18);
                    sprintf(extra, "%0.0f m", Distance);
                    esp.DrawTextAltert(Color(180, 250, 181, 200), extra,
                        Vec22(screenWidth / 80, y), textsize);
                }
            }
            else  if(isPlayerLine)
{ if(isBot){
esp.DrawLine(Color(0, 255, 0), screenHeight / 500,
                   Vec22(screenWidth / 2, screenHeight / 10.5 + 8), Vec22(x, top));
} else {
                   esp.DrawLine(Color(255, 255, 255, 255), screenHeight / 500,
                   Vec22(screenWidth / 2, screenHeight / 10.5 + 8), Vec22(x, top));  } }                                  }}
  if (botCount + playerCount > 0)        {
                            sprintf(extra, "Enemies Nearby:%d ", playerCount);
            esp.DrawTextNormal(Color(50, 255, 50), extra,
                         Vec22(screenWidth / 2 - screenHeight / 6, screenHeight / 10.8),
                         screenHeight / 27);
            sprintf(extra, "Bots Nearby:%d", botCount);
            esp.DrawTextNormal(Color(50, 255, 50), extra,
                         Vec22(screenWidth / 2 + screenHeight / 7.5, screenHeight / 10.8),
                         screenHeight / 27);
            esp.DrawLine(Color(0, 0, 0), 6, Vec22(screenWidth / 2, screenHeight / 18),
                         Vec22(screenWidth / 2, screenHeight / 10.5));         
           }            else {
        esp.DrawFilledRect(Color(0, 0, 0, 0),
                                   Vec22(screenWidth / 2 - screenHeight / 15, screenHeight / 18),
                                   Vec22(screenWidth / 2 + screenHeight / 15, 90));
                          
         esp.DrawTextNormal(Color(0, 255, 0),"CLEAR", Vec22(
                                screenWidth/2, 80), 30);
        }
			                 
                             }       
		                     
                          
                          
                           
                           
                           
                           
#endif //PUT_CHEATS__HACKS_H

