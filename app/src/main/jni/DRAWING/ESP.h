//
// Create by CCASTER on 30/05/2021
//
#ifndef FOX_CHEATS_CANVAS_DRAWING_H
#define FOX_CHEATS_CANVAS_DRAWING_H
#include "struct.h"

class ESP
{
  private:
	JNIEnv * _env;
	jobject _cvsView;
	jobject _cvs;


  public:
	  ESP()
	{
		_env = nullptr;
		_cvsView = nullptr;
		_cvs = nullptr;
	}

	ESP(JNIEnv * env, jobject cvsView, jobject cvs)
	{
		this->_env = env;
		this->_cvsView = cvsView;
		this->_cvs = cvs;
	}

	bool isValid() const
	{
		return (_env != nullptr && _cvsView != nullptr && _cvs != nullptr);
	}

	int getWidth() const
	{
		if (isValid())
		{
			jclass canvas = _env->GetObjectClass(_cvs);
			jmethodID width = _env->GetMethodID(canvas, "getWidth", "()I");
			  return _env->CallIntMethod(_cvs, width);
		}
		return 0;
	}

	int getHeight() const
	{
		if (isValid())
		{
			jclass canvas = _env->GetObjectClass(_cvs);
			jmethodID width = _env->GetMethodID(canvas, "getHeight", "()I");
			  return _env->CallIntMethod(_cvs, width);
		}
		return 0;
	}

	void DrawLine(Color color, float thickness, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawLine",
												   "(Landroid/graphics/Canvas;IIIIFFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b,
								 thickness, start.x, start.y, end.x, end.y);
		}
	}
	void DrawLinesharp(Color color, float thickness, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawLinesharp",
												   "(Landroid/graphics/Canvas;IIIIFFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b,
								 thickness, start.x, start.y, end.x, end.y);
		}
	}

	void DrawLineBot(Color color, float thickness, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawlinebot = _env->GetMethodID(canvasView, "DrawLineBot",
													  "(Landroid/graphics/Canvas;IIIIFFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawlinebot, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b,
								 thickness, start.x, start.y, end.x, end.y);
		}
	}

	void DrawSkeleton(Color color, float thickness, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawskeleton = _env->GetMethodID(canvasView, "DrawSkeleton",
													   "(Landroid/graphics/Canvas;IIIIFFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawskeleton, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b,
								 thickness, start.x, start.y, end.x, end.y);
		}
	}

	void DrawRect(Color color, float thickness, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawRect",
												   "(Landroid/graphics/Canvas;IIIIFFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b,
								 thickness, start.x, start.y, end.x, end.y);
		}
	}

	void DrawRect2(Color color, float thickness, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawRect2",
												   "(Landroid/graphics/Canvas;IIIIFFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b,
								 thickness, start.x, start.y, end.x, end.y);
		}
	}
	void DrawNamesharp(Color color, const char *txt,int teamid, Vec22 pos, float size) {
        if (isValid()) {
            jclass canvasView = _env->GetObjectClass(_cvsView);
            jmethodID drawtext = _env->GetMethodID(canvasView, "DrawNamesharp",
                                                   "(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V");
            jstring s=_env->NewStringUTF(txt);
            _env->CallVoidMethod(_cvsView, drawtext, _cvs, (int) color.a, (int) color.r,
                                 (int) color.g, (int) color.b,
                                 s,teamid, pos.x, pos.y, size);
            _env->DeleteLocalRef(s);
        }
    }
    void DrawTextsharp(Color color, const char *txt, Vec22 pos, float size) {
        if (isValid()) {
            jclass canvasView = _env->GetObjectClass(_cvsView);
            jmethodID drawtext = _env->GetMethodID(canvasView, "DrawTextsharp",
                                                   "(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
            jstring s=_env->NewStringUTF(txt);
            _env->CallVoidMethod(_cvsView, drawtext, _cvs, (int) color.a, (int) color.r,
                                 (int) color.g, (int) color.b,
                                 s, pos.x, pos.y, size);
            _env->DeleteLocalRef(s);
        }
    }


	void DrawFilledRect3(Color color, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawFilledRect3",
												   "(Landroid/graphics/Canvas;IIIIFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, start.x, start.y, end.x, end.y);
		}
	}


	void DrawBox(Color color, float thickness, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawBox",
												   "(Landroid/graphics/Canvas;IIIIFFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b,
								 thickness, start.x, start.y, end.x, end.y);
		}
	}
	void DrawBox1(Color color, float stroke, Rect rect)
	{
		Vec22 v1 = Vec22(rect.x, rect.y);
		Vec22 v2 = Vec22(rect.x + rect.width, rect.y);
		Vec22 v3 = Vec22(rect.x + rect.width, rect.y + rect.height);
		Vec22 v4 = Vec22(rect.x, rect.y + rect.height);

		DrawBox(color, stroke, v1, v2);
		DrawBox(color, stroke, v2, v3);
		DrawBox(color, stroke, v3, v4);
		DrawBox(color, stroke, v4, v1);
	}

	void DrawFilledRect(Color color, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawFilledRect",
												   "(Landroid/graphics/Canvas;IIIIFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, start.x, start.y, end.x, end.y);
		}
	}

	void DrawFilledRect2(Color color, Vec22 start, Vec22 end)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawFilledRect2",
												   "(Landroid/graphics/Canvas;IIIIFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, start.x, start.y, end.x, end.y);
		}
	}

	void DebugText(char *s)
	{
		jclass cls = _env->GetObjectClass(_cvsView);
		jmethodID mid = _env->GetMethodID(cls, "DebugText", "(Ljava/lang/String;)V");
		jstring name = _env->NewStringUTF(s);
		_env->CallVoidMethod(_cvsView, mid, name);
		_env->DeleteLocalRef(name);
	}

    void DrawTextNormal(Color color, const char *txt, Vec22 pos, float size)
    {
        if (isValid())
        {
            jclass canvasView = _env->GetObjectClass(_cvsView);
            jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawTextNormal",
                                                   "(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
            jstring s = _env->NewStringUTF(txt);
            _env->CallVoidMethod(_cvsView, Drawtext, _cvs, (int)color.a, (int)color.r,
                                 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
            _env->DeleteLocalRef(s);
        }
	}
	void DrawText(Color color, const char *txt, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawText",
												   "(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtext, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}
	void DrawText4(Color color, const char *txt, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawText4",
												   "(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtext, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}
	
	void DrawPoint(Color color, Vec22 pos, float radius)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawfilledcircle = _env->GetMethodID(canvasView, "DrawPoint",
														   "(Landroid/graphics/Canvas;IIIIFFF)V");
			_env->CallVoidMethod(_cvsView, Drawfilledcircle, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, pos.x, pos.y, radius);
		}
	}
	void DrawTextDistance(Color color, const char *txt, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtextdistance = _env->GetMethodID(canvasView, "DrawTextDistance",
														   "(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtextdistance, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}

	void DrawTextName(Color color, const char *txt, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawTextName",
												   "(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtext, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}

	void DrawTextAltert(Color color, const char *txt, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtextalert = _env->GetMethodID(canvasView, "DrawTextAltert",
														"(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtextalert, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}
	void DrawTextAltert2(Color color, const char *txt, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtextalert = _env->GetMethodID(canvasView, "DrawTextAltert2",
														"(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtextalert, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}

	
	void DrawWeapon(Color color, int wid,int ammo, Vec22 pos, float size) {
        if (isValid()) {
            jclass canvasView = _env->GetObjectClass(_cvsView);
            jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawWeapon",
                                                   "(Landroid/graphics/Canvas;IIIIIIFFF)V");
            _env->CallVoidMethod(_cvsView, Drawtext, _cvs, (int) color.a, (int) color.r,
                                 (int) color.g, (int) color.b,
                                 wid,ammo, pos.x, pos.y, size);
        }
    }
	void DrawName(Color color, const char *txt, int teamid, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawName",
												   "(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtext, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, teamid, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}
	void DrawItems(const char *txt, float distance, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawItems",
												   "(Landroid/graphics/Canvas;Ljava/lang/String;FFFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtext, _cvs, s, distance, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}
	void DrawVehicles(const char *txt, float distance, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawVehicles",
												   "(Landroid/graphics/Canvas;Ljava/lang/String;FFFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtext, _cvs, s, distance, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}
	void DrawFilledCircle(Color color, Vec22 pos, float radius)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawfilledcircle = _env->GetMethodID(canvasView, "DrawFilledCircle",
														   "(Landroid/graphics/Canvas;IIIIFFF)V");
			_env->CallVoidMethod(_cvsView, Drawfilledcircle, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, pos.x, pos.y, radius);
		}
	}
	void DrawHead(Color color, Vec22 pos, float radius)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawhead = _env->GetMethodID(canvasView, "DrawHead",
												   "(Landroid/graphics/Canvas;IIIIFFF)V");
			_env->CallVoidMethod(_cvsView, Drawhead, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, pos.x, pos.y, radius);
		}
	}

	void DrawOTH(Vec22 start, int num)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawline = _env->GetMethodID(canvasView, "DrawOTH",
												   "(Landroid/graphics/Canvas;IFF)V");
			_env->CallVoidMethod(_cvsView, Drawline, _cvs, num, start.x, start.y);
		}
	}


	void DrawCircle(Color color, Vec22 pos, float radius, float thickness)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawcircle = _env->GetMethodID(canvasView, "DrawCircle",
													 "(Landroid/graphics/Canvas;IIIIFFFF)V");
			_env->CallVoidMethod(_cvsView, Drawcircle, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, pos.x, pos.y, radius, thickness);
		}
	}

	void DrawCircle2(Color color, Vec22 pos, float radius)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID DrawCircle = _env->GetMethodID(canvasView, "DrawCircle2",
													 "(Landroid/graphics/Canvas;IIIIFFF)V");
			_env->CallVoidMethod(_cvsView, DrawCircle, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, pos.x, pos.y, radius);
		}
	}
		   
	void DrawName2(Color color, const char *txt,int teamid,Vec22 pos, float size) {
        if (isValid()) {
            jclass canvasView = _env->GetObjectClass(_cvsView);
            jmethodID canvasdrawtext = _env->GetMethodID(canvasView, "DrawName2",
                                                   "(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V");
            jstring s=_env->NewStringUTF(txt);
            _env->CallVoidMethod(_cvsView, canvasdrawtext, _cvs, (int) color.a, (int) color.r,
                                 (int) color.g, (int) color.b,
                                 s,teamid, pos.x, pos.y, size);
            _env->DeleteLocalRef(s);
        }
    } 
    void DrawName3(Color color, const char *txt,Vec22 pos, float size) {
        if (isValid()) {
            jclass canvasView = _env->GetObjectClass(_cvsView);
            jmethodID canvasdrawtext = _env->GetMethodID(canvasView, "DrawName3",
                                                   "(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V");
            jstring s=_env->NewStringUTF(txt);
            _env->CallVoidMethod(_cvsView, canvasdrawtext, _cvs, (int) color.a, (int) color.r,
                                 (int) color.g, (int) color.b,
                                 s,pos.x, pos.y, size);
            _env->DeleteLocalRef(s);
        }
    } 
	void DrawName4(Color color, const char *txt,Vec22 pos, float size) {
        if (isValid()) {
            jclass canvasView = _env->GetObjectClass(_cvsView);
            jmethodID canvasdrawtext = _env->GetMethodID(canvasView, "DrawName4",
                                                   "(Landroid/graphics/Canvas;IIIILjava/lang/String;IFFF)V");
            jstring s=_env->NewStringUTF(txt);
            _env->CallVoidMethod(_cvsView, canvasdrawtext, _cvs, (int) color.a, (int) color.r,
                                 (int) color.g, (int) color.b,
                                 s, pos.x, pos.y, size);
            _env->DeleteLocalRef(s);
        }
    } 
	

	void DrawText3(Color color, const char *txt, Vec22 pos, float size)
	{
		if (isValid())
		{
			jclass canvasView = _env->GetObjectClass(_cvsView);
			jmethodID Drawtext = _env->GetMethodID(canvasView, "DrawText3",
												   "(Landroid/graphics/Canvas;IIIILjava/lang/String;FFF)V");
			jstring s = _env->NewStringUTF(txt);
			_env->CallVoidMethod(_cvsView, Drawtext, _cvs, (int)color.a, (int)color.r,
								 (int)color.g, (int)color.b, s, pos.x, pos.y, size);
			_env->DeleteLocalRef(s);
		}
	}
};


#endif // FOX_CHEATS_CANVAS_DRAWING_H
