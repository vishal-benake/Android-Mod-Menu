#include <jni.h>
#include <string>
#include <list>
#include <vector>
#include <string.h>
#include <pthread.h>
#include <cstring>
#include <jni.h>
#include <unistd.h>
#include <fstream>
#include "DRAWING/ESP.h"
#include "DRAWING/Hacks.h"
#include "Logger.h"
#include "Config.h"
#define SOCKET_NAME "\0andyougo"
#include <HOOK/Includes/Utils.h>
#if defined(__aarch64__)
#include <HOOK/And64InlineHook/And64InlineHook.hpp>
#else
#include <HOOK/Substrate/SubstrateHook.h>
#include <HOOK/Substrate/CydiaSubstrate.h>
#endif
#include "HOOK/KittyMemory/MemoryPatch.h"
#include "HOOK/Includes/Logger.h"
#include "HOOK/Includes/Utils.h"
using namespace std;
struct My_Patches {
 MemoryPatch           
flash,
flash2,
Bypass, 
Bypass1,
Bypass2,
Bypass3,
Bypass4,
Bypass5,
Bypass6,
Bypass7,
Bypass8,
Bypass9,
Bypass10,
Bypass11,
Bypass12,
Bypass13,
Bypass14,
Bypass15,
Bypass16,
Bypass17,
Bypass18,
Bypass19,
Bypass20,
Bypass21,
Bypass22,
Bypass23,
Bypass24,
Bypass25,
Bypass26,
Bypass27,
Bypass28,
Bypass29,
Bypass30,
Bypass31,
Bypass32,
Bypass33,
Bypass34,
Bypass35,
Bypass36,
Bypass37,
Bypass38,
Bypass39,
Bypass40,
Bypass41,
Bypass42,
Bypass43,
Bypass44,
Bypass45,
Bypass46,
Bypass47,
Bypass48,
Bypass49,
CarJump,
Less,
Small,
AimLock, 
HIGHView
;
    
} Patches; bool 
Bypass =false,
Less = false,
Small = false,
FastBulllet = false,
flash = false,
CarJump = false,
AimLock = false, 
HIGHView = false,
featureHookToggle = false;
void *instanceBtn;
ESP espOverlay;
bool MEMBYPASS = false;
bool BPS = false;
bool BPS2 = false;
bool antiCrash = false;


JNIEXPORT jstring JNICALL
Java_com_kin_mod_Launcher_Toast(JNIEnv * env, jclass clazz)
{
}

extern "C"
JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_DrawOn(JNIEnv * env, jclass, jobject espView,
                                                    jobject canvas) {
        espOverlay = ESP(env, espView, canvas);
       if(isESP){
        if (espOverlay.isValid())
        {
            DrawESP(espOverlay, espOverlay.getWidth(), espOverlay.getHeight());
        if(!aimbot){
        options.openState = -1;
        }
    }}
}

extern "C" {
JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_SettingValue(JNIEnv *, jobject, jint code,
                                                                  jboolean jboolean1) {
        switch ((int)code)
        {
       case 0:
            isESP = jboolean1;
            break;
        case 1:
            isPlayerBox = jboolean1;
            break;
        case 2:
            isPlayerLine = jboolean1;
            break;
        case 3:
            isPlayerDist = jboolean1;
            break;
        case 4:
            isPlayerHealth = jboolean1;
            break;
        case 5:
            isPlayerName = jboolean1;
            break;
        case 6:
            isPlayerHead = jboolean1;
            break;
        case 7:
            isr360Alert = jboolean1;
            break;
        case 8:
            isSkelton1 = jboolean1;
            break;
        case 9:
            isGrenadeWarning = jboolean1;
            break;
        case 10:
            isEnemyWeapon = jboolean1;
            break;
        case 15:
            isPlayerName2 = jboolean1;
            break;
	    case 11:
			aimbot = jboolean1;
			if (aimbot)
			{
				options.openState = 0;
			}
			else
			{
				options.openState = -1;
			}
			break;	
        
        case 12:
            options.tracingStatus = jboolean1;
            break;
        case 13:
            options.pour = jboolean1;
            break;
        
     
        }
    }


extern "C"
JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_Size(JNIEnv * env, jclass type, jint num,
                                                          jfloat size) {
        switch (num)
        {
        case 1:
            itemSize = size;
            break;
        case 2:
            enemySize = size;
            break;
        case 3:
            vehicleSize = size;
            break;
        case 4:
            fpsRender = size;
            break;
        case 5:
            alertSize = size;
            break;
        default:
            break;
        }
    }

extern "C"
JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_Protection(JNIEnv *, jobject, jint code,
                                                                jboolean jboolean1) {
        switch ((int)code)
        {
        case 0:
            MEMBYPASS = jboolean1;
            if (MEMBYPASS) {   
            Patches.Bypass.Modify(); 
Patches.Bypass1.Modify();
Patches.Bypass2.Modify();
Patches.Bypass3.Modify();
Patches.Bypass4.Modify();
Patches.Bypass5.Modify();
Patches.Bypass6.Modify();
Patches.Bypass7.Modify();
Patches.Bypass8.Modify();
Patches.Bypass9.Modify();
Patches.Bypass10.Modify();
Patches.Bypass11.Modify();
Patches.Bypass12.Modify();
Patches.Bypass13.Modify();
Patches.Bypass14.Modify();
Patches.Bypass15.Modify();
Patches.Bypass16.Modify();
Patches.Bypass17.Modify();
Patches.Bypass18.Modify();
Patches.Bypass19.Modify();
Patches.Bypass20.Modify();
Patches.Bypass21.Modify();
Patches.Bypass22.Modify();
Patches.Bypass23.Modify();
Patches.Bypass24.Modify();
Patches.Bypass25.Modify();
Patches.Bypass26.Modify();
Patches.Bypass27.Modify();
Patches.Bypass28.Modify();
Patches.Bypass29.Modify();
Patches.Bypass30.Modify();
Patches.Bypass31.Modify();
Patches.Bypass32.Modify();
Patches.Bypass33.Modify();
Patches.Bypass34.Modify();
Patches.Bypass35.Modify();
Patches.Bypass36.Modify();
Patches.Bypass37.Modify();
Patches.Bypass38.Modify();
Patches.Bypass39.Modify();
Patches.Bypass40.Modify();
Patches.Bypass41.Modify();
Patches.Bypass42.Modify();
                } else {
                Patches.Bypass.Restore(); 
Patches.Bypass1.Restore();
Patches.Bypass2.Restore();
Patches.Bypass3.Restore();
Patches.Bypass4.Restore();
Patches.Bypass5.Restore();
Patches.Bypass6.Restore();
Patches.Bypass7.Restore();
Patches.Bypass8.Restore();
Patches.Bypass9.Restore();
Patches.Bypass10.Restore();
Patches.Bypass11.Restore();
Patches.Bypass12.Restore();
Patches.Bypass13.Restore();
Patches.Bypass14.Restore();
Patches.Bypass15.Restore();
Patches.Bypass16.Restore();
Patches.Bypass17.Restore();
Patches.Bypass18.Restore();
Patches.Bypass19.Restore();
Patches.Bypass20.Restore();
Patches.Bypass21.Restore();
Patches.Bypass22.Restore();
Patches.Bypass23.Restore();
Patches.Bypass24.Restore();
Patches.Bypass25.Restore();
Patches.Bypass26.Restore();
Patches.Bypass27.Restore();
Patches.Bypass28.Restore();
Patches.Bypass29.Restore();
Patches.Bypass30.Restore();
Patches.Bypass31.Restore();
Patches.Bypass32.Restore();
Patches.Bypass33.Restore();
Patches.Bypass34.Restore();
Patches.Bypass35.Restore();
Patches.Bypass36.Restore();
Patches.Bypass37.Restore();
Patches.Bypass38.Restore();
Patches.Bypass39.Restore();
Patches.Bypass40.Restore();
Patches.Bypass41.Restore();
Patches.Bypass42.Restore();
                system("rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Intermediate/SaveGames/JKGuestRegisterCnt.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs");
                }
                break;
                
        
        case 2: // Fix Crash Root
            antiCrash = jboolean1;
            if (antiCrash)
            {
                system("rm -rf /data/data/com.tencent,ig/app_crashrecord"
                       "touch /data/data/com.tencent,ig/app_crashrecord"
                       "rm -rf /data/data/com.pubg.krmobile/app_crashrecord"
                       "touch /data/data/com.pubg.krmobile/app_crashrecord"
                       "rm -rf /data/data/com.pubg.krmobile/app_crashrecord"
                       "touch /data/data/com.pubg.krmobile/app_crashrecord"
                       "rm -rf /data/data/com.pubg.krmobile/app_crashrecord"
                       "touch /data/data/com.pubg.krmobile/app_crashrecord"
                       "chmod 000 /data/data/com.pubg.krmobile/files/tss_tmp"
                       "chmod 000 /data/data/com.pubg.krmobile/files/tss_tmp"
                       "chmod 000 /data/data/com.pubg.krmobile/files/tss_tmp"
                       "chmod 000 /data/data/com.pubg.krmobile/files/tss_tmp");
            }
            else
            {
                system("rm -rf /data/data/com.tencent,ig/app_crashrecord"
                       "rm -rf /data/data/com.pubg.krmobile/app_crashrecord"
                       "rm -rf /data/data/com.pubg.krmobile/app_crashrecord"
                       "rm -rf /data/data/com.pubg.krmobile/app_crashrecord"
                       "chmod 777 /data/data/com.pubg.krmobile/files/tss_tmp"
                       "chmod 777 /data/data/com.pubg.krmobile/files/tss_tmp"
                       "chmod 777 /data/data/com.pubg.krmobile/files/tss_tmp"
                       "chmod 777 /data/data/com.pubg.krmobile/files/tss_tmp");
            }
            break;
        case 3:
            BPS2 = jboolean1;
            if (BPS2)
            {
                system("iptables -I INPUT -s down.anticheatexpert.com -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s down.anticheatexpert.com -j DROP &>/dev/null"
                       "iptables -I INPUT -s down.qq.com -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s down.qq.com -j DROP &>/dev/null"
                       "iptables -I INPUT -s down.anticheatexpert.com -j REJECT &>/dev/null"
                       "iptables -I OUTPUT -s down.anticheatexpert.com -j REJECT &>/dev/null"
                       "iptables -I INPUT -s down.qq.com -j REJECT &>/dev/null"
                       "iptables -I OUTPUT -s down.qq.com -j REJECT &>/dev/null"
                       "iptables -I OUTPUT -s com.tencent.quantum.share.QuantumFileProvider -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.googlefirebase.provider.FirebaseInitProvider -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.helpshift.support.provider.HelpshiftFileProvider -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.facebook.internal.FacebookInitprovider -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.pubg.krmobile.OBBDownloaderService    -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.tencent.quantum.IGFirebaseInstanceIDService -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.google.firebase.messaging.FirebaseMessagingService -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.tencent.imsdk.android.webview.qq.WebViewService -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.tencent.midas.oversea.newnetwork.service.APNetDetectService -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.tencent.midas.oversea.business.h5.WebService -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s com.tencent.quantum.download.GCBGDownloadService -j DROP &>/dev/null"
                       "iptables -I OUTPUT -s down.anticheatexpert.com -j DROP &>/dev/null"
                       "iptables -I INPUT -s tencentgames.helpshift.com -j DROP &>/dev/null="
                       "iptables -I INPUT -s *:443 -j DROP &>/dev/null"
                       "iptables -I INPUT -s *:9031 -j DROP &>/dev/null"
                       "iptables -I INPUT -s *:9030 -j DROP &>/dev/null"
                       "iptables -I INPUT  -s pubgm.igamecj.com -j REJECT &>/dev/null"
                       "iptables -I OUTPUT -s pubgm.igamecj.com -j REJECT &>/dev/null"
                       "iptables -I INPUT  -s tencent.igamecj.com -j REJECT &>/dev/null"
                       "iptables -I OUTPUT -s tencent.igamecj.com -j REJECT &>/dev/null"
                       "iptables -I INPUT  -s report.igamecj.com -j REJECT &>/dev/null"
                       "iptables -I OUTPUT -s report.igamecj.com -j REJECT &>/dev/null"
                       "iptables -I OUTPUT -s gl.lobby.igamecj.com -j REJECT &>/dev/null"
                       "touch /storage/emulated/0/iptables_off.sh su -c iptables -F iptables -F su -c iptables --flush"
                       "chmod 777 /sdcard/iptables_off.sh");
            }
            else
            {
                system("su -c iptables -F"
                       "iptables -F"
                       "su -c iptables --flush"
                       "iptables --flushl"
                       "touch /storage/emulated/0/Android/ASU.txt IDIOT_KONTOL_BABI_ASU_BANGSAD_GADA_AHLAK_LO_PAKE_CIT");
            }
                  break;
        case 4:
                system("makdir /storage/emulated/0/Android/codexpatcherLogs SUCCESSFUL CLEAR"
                       "rm -rf /storage/emulated/0/tencent"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15150.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15151.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15153.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15154.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15155.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15156.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15150.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15151.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15153.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15154.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15155.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15156.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15150.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15151.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15153.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15154.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15155.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15156.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15150.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15151.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15153.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15154.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15155.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.4.0.15156.pak"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_137_1.3.0.14926_20210324214115_1851371208_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14923.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14924.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14925.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14926.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14927.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14928.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/login-identifier.txt"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/ProgramBinaryCache"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Intermediate/SaveGames/JKGuestRegisterCnt.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/MMKV"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_137_1.3.0.14926_20210324214115_1851371208_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp0"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp1"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/pufferTempDir"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Pandora"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp0"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp1"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/pufferTempDir"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Pandora"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp0"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp1"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/pufferTempDir"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Pandora"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp0"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/puffer_temp1"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/pufferTempDir"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Pandora"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14923.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14924.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14925.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14926.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14927.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14928.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/login-identifier.txt"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/ProgramBinaryCache"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Intermediate/SaveGames/JKGuestRegisterCnt.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/MMKV"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_137_1.3.0.14926_20210324214115_1851371208_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14923.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14924.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14925.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14926.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14927.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14928.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/login-identifier.txt"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/ProgramBinaryCache"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Intermediate/SaveGames/JKGuestRegisterCnt.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/MMKV"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_137_1.3.0.14926_20210324214115_1851371208_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14923.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14924.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14925.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14926.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14927.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14928.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/login-identifier.txt"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/ProgramBinaryCache"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Intermediate/SaveGames/JKGuestRegisterCnt.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/MMKV"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.3.0.14922_20210309205606_824662004_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations/concurrent"
                       "rm -rf third_party.java_src.error_prone.project.annotations.Google_internal"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.3.0.14922_20210309205606_824662004_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations/concurrent"
                       "rm -rf third_party.java_src.error_prone.project.annotations.Google_internal"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.3.0.14922_20210309205606_824662004_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations/concurrent"
                       "rm -rf third_party.java_src.error_prone.project.annotations.Google_internal"
                       "rm -rf /storage/emulated/0/Android/.backups"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.3.0.14922_20210309205606_824662004_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/core_patch_1.4.0.15152.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14921.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/game_patch_1.3.0.14922.pak"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /mnt/shell/0/emulated/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/cache/GCloud.ini"
                       "rm -rf /sdcard/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Logs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.1.0.14556_20201210094036_1246353928_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer-temp"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/1375135419_47_1.4.0.15156_20210520180349_1414572672_cures.ifs.res"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/apollo_reslist.flist"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/filelist.json"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/puffer_res.eifs"
                       "rm -rf /storage/emulated/0/Android/data/com.pubg.krmobile/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/Paks/PufferFileList.json"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations"
                       "rm -rf src/main/java/com/google/errorprone/annotations/concurrent"
                       "rm -rf third_party.java_src.error_prone.project.annotations.Google_internal");
                break;
                default:
                break;
        }
    }
   
extern "C" 
JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_Range(JNIEnv *, jobject, jint range) 
{
    options.aimingRange = 1 + range;
}

extern "C" JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_Target(JNIEnv *, jobject, jint i)
{
    options.aimbotmode = i;
}

extern "C" JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_AimWhen(JNIEnv *, jobject, jint i)
{
    options.aimingState = i;
}

extern "C" JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_AimBy(JNIEnv *, jobject, jint i)
{
    options.priority = i;
}


extern "C" {
JNIEXPORT void JNICALL
Java_com_kin_mod_Launcher_Hack(JNIEnv *, jobject, jint code,
                                                              jboolean jboolean1) {
        switch ((int)code) {
        case 1:
           Less = jboolean1; 
           if (Less) {
           Patches.Less.Modify();
           } else {
           Patches.Less.Restore();
           }
           break;
        case 2:
           Small = jboolean1; 
           if (Small) {
           Patches.Small.Modify();
           } else {
           Patches.Small.Restore();
           }
           break;
           break;
        case 3:
           AimLock = jboolean1; 
           if (AimLock) {
           Patches.AimLock.Modify();
           } else {
           Patches.AimLock.Restore();
           }
           break;
        case 4:
           HIGHView = jboolean1; 
           if (HIGHView) {
           Patches.HIGHView.Modify();
           } else {
           Patches.HIGHView.Restore();
           }
           break;
        case 5:
           Bypass = jboolean1; 
           if (Bypass) {
           } else {
           }
           break;  
        case 6:
           flash = jboolean1; 
           if (flash) {
           Patches.flash.Modify();
           Patches.flash2.Modify();
           } else {
           Patches.flash.Restore();
           Patches.flash2.Restore();
           }
            break;  
         case 7:
           CarJump = jboolean1; 
           if (CarJump) {
           Patches.CarJump.Modify();           
           } else {
           Patches.CarJump.Restore();          
           }
            break;  
        }
    }
}
void (*old_Update)(void *instance);
void Update(void *instance) { instanceBtn = instance; old_Update(instance); }
void *Super_thread(void *) { ProcMap il2cppMap; do { il2cppMap = KittyMemory::getLibraryMap("libUE4.so");  sleep(1); } while(!il2cppMap.isValid());
/*Patches.Less = MemoryPatch::createWithHex("libUE4.so", 0x14284A8, "00 00 00 00");
Patches.Small = MemoryPatch::createWithHex("libUE4.so", 0x1428A60, "00 00 00 00");
Patches.AimLock = MemoryPatch::createWithHex("libUE4.so", 0x27238D0, "00 00 00 00");
Patches.HIGHView = MemoryPatch::createWithHex("libUE4.so", 0x3A05C20, "00 00 8C 43");
Patches.CarJump = MemoryPatch::createWithHex("libUE4.so",0x48F5370, "00 00 00 00", 4);
Patches.flash = MemoryPatch::createWithHex("libUE4.so",0x3A5FA5C, "00 00 00 00", 4);
Patches.flash2 = MemoryPatch::createWithHex("libUE4.so",0x3F95CBC, "00 00 00 00", 4);*/
Patches.Small = MemoryPatch::createWithHex("libUE4.so",0x142908C, "00 00 A0 40");

Patches.Less = MemoryPatch::createWithHex("libUE4.so", 0x3AE57F0, "00 00 00 00");
    Patches.Bypass = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912F190, "01 02 00 04");
    Patches.Bypass1 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912F2B4, "01 02 00 04");
    Patches.Bypass2 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912F38C, "01 02 00 04");
    Patches.Bypass3 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912F45C, "01 02 00 04");
    Patches.Bypass4 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912F5FC, "01 02 00 04");
    Patches.Bypass5 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912F9B4, "01 02 00 04");
    Patches.Bypass6 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912F9C0, "01 02 00 04");
    Patches.Bypass7 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1912FC80, "01 02 00 04");
    Patches.Bypass8 = MemoryPatch::createWithHex("http://libtersafe.so", 0x191307AC, "01 02 00 04");
    Patches.Bypass9 = MemoryPatch::createWithHex("http://libtersafe.so", 0x191308B0, "01 02 00 04");
    Patches.Bypass10 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19130B10, "01 02 00 04");
    Patches.Bypass11 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19130BE4, "01 02 00 04");
    Patches.Bypass12 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19130C28, "01 02 00 04");
    Patches.Bypass13 = MemoryPatch::createWithHex("http://libtersafe.so", 0x191397DC, "01 02 00 04");
    Patches.Bypass14 = MemoryPatch::createWithHex("http://libtersafe.so", 0x191397F8, "01 02 00 04");
    Patches.Bypass15 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19139A8C, "01 02 00 04");
    Patches.Bypass16 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1913A5A4, "01 02 00 04");
    Patches.Bypass17 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1913A614, "01 02 00 04");
    Patches.Bypass18 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1913A694, "01 02 00 04");
    Patches.Bypass19 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1913A69C, "01 02 00 04");
    Patches.Bypass20 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19143118, "01 02 00 04");
    Patches.Bypass21 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19143184, "01 02 00 04");
    Patches.Bypass22 = MemoryPatch::createWithHex("http://libtersafe.so", 0x191432E0, "01 02 00 04");
    Patches.Bypass23 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19143384, "01 02 00 04");
    Patches.Bypass24 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19143874, "01 02 00 04");
    Patches.Bypass25 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19143D6C, "01 02 00 04");
    Patches.Bypass26 = MemoryPatch::createWithHex("http://libtersafe.so", 0x19143E50, "01 02 00 04");
    Patches.Bypass27 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1914444C, "01 02 00 04");
    Patches.Bypass28 = MemoryPatch::createWithHex("http://libtersafe.so", 0x1917DFDC, "01 02 00 04");
    Patches.Bypass29 = MemoryPatch::createWithHex("http://libtersafe.so", 0x2373A80, "01 02 00 04");
    Patches.Bypass30 = MemoryPatch::createWithHex("http://libtersafe.so", 0x23962C8, "01 02 00 04");
    Patches.Bypass31 = MemoryPatch::createWithHex("http://libtersafe.so", 0x23E2E68, "01 02 00 04");
    Patches.Bypass32 = MemoryPatch::createWithHex("http://libtersafe.so", 0x23E2E6C, "01 02 00 04");
    Patches.Bypass33 = MemoryPatch::createWithHex("http://libtersafe.so", 0x23E2E70, "01 02 00 04");
    Patches.Bypass34 = MemoryPatch::createWithHex("http://libtersafe.so", 0x23E2E74, "01 02 00 04");
    Patches.Bypass35 = MemoryPatch::createWithHex("http://libtersafe.so", 0x23E2E78, "01 02 00 04");
    Patches.Bypass36 = MemoryPatch::createWithHex("http://libtersafe.so", 0x248A82C, "01 02 00 04");
    Patches.Bypass37 = MemoryPatch::createWithHex("http://libtersafe.so", 0x248A830, "01 02 00 04");
    Patches.Bypass38 = MemoryPatch::createWithHex("http://libtersafe.so", 0x251B7AC, "01 02 00 04");
    Patches.Bypass39 = MemoryPatch::createWithHex("http://libtersafe.so", 0x44914EC, "01 02 00 04");
    Patches.Bypass40 = MemoryPatch::createWithHex("http://libtersafe.so", 0x62156D0, "01 02 00 04");
    Patches.Bypass41 = MemoryPatch::createWithHex("http://libtersafe.so", 0x62CB440, "01 02 00 04");
    Patches.Bypass42 = MemoryPatch::createWithHex("http://libtersafe.so", 0x65D5C68, "01 02 00 04");

return NULL;

}
void *hack_thread(void *) { ProcMap il2cppMap; do { il2cppMap = KittyMemory::getLibraryMap("libtersafe.so");  sleep(1); } while(!il2cppMap.isValid());   
    return NULL;
}
__attribute__((constructor))
void initializer() {
    // Create a new thread so it does not block the main thread, means the game would not freeze
    pthread_t ptid;
    pthread_create(&ptid, NULL, Super_thread, NULL);
}

JNIEXPORT jint JNICALL
JNI_OnLoad(JavaVM *vm, void *reserved) {
    JNIEnv *globalEnv;
    vm->GetEnv((void **) &globalEnv, JNI_VERSION_1_6);
    pthread_t ptid;   
    pthread_create(&ptid, NULL, hack_thread, NULL);
    return JNI_VERSION_1_6;
}


JNIEXPORT void JNICALL
JNI_OnUnload(JavaVM *vm, void *reserved) {
	}
	}

