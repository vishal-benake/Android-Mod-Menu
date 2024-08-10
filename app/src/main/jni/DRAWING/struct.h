//
// Create by CCASTER on 30/05/2021
//
#ifndef PUT_CHEATS_CANVAS_STRUCT_H
#define PUT_CHEATS_CANVAS_STRUCT_H

#include <string>
#define maxplayerCount 100
#define maxvehicleCount 50
#define maxitemsCount 400
#define maxgrenadeCount 10


class Color
{
  public:
	float r;
	float g;
	float b;
	float a;

	  Color()
	{
		this->r = 0;
		this->g = 0;
		this->b = 0;
		this->a = 0;
	}

	Color(float r, float g, float b, float a)
	{
		this->r = r;
		this->g = g;
		this->b = b;
		this->a = a;
	}

	Color(float r, float g, float b)
	{
		this->r = r;
		this->g = g;
		this->b = b;
		this->a = 255;
	}

	static Color White()
	{
		return Color(255, 255, 255);
	}

	static Color Oren()
	{
		return Color(255, 100, 0, 255);
	}
	static Color Ungu2()
	{
		return Color(105, 0, 255, 255);
	}
	static Color Ungu()
	{
		return Color(129, 0, 255);
	}

	static Color Red()
	{
		return Color(255, 0, 0);
	}
	static Color Red2()
	{
		return Color(255, 26, 26);
	}
	static Color Red3()
	{
		return Color(255, 77, 77);
	}

	static Color Orange()
	{
		return Color(255, 102, 0);
	}

	static Color Orange2()
	{
		return Color(255, 133, 51);
	}

	static Color Orange3()
	{
		return Color(255, 133, 51);
	}


	static Color Y()
	{
		return Color(255, 255, 0);
	}

	static Color Yellow()
	{
		return Color(255, 255, 0);
	}

	static Color Yellow2()
	{
		return Color(255, 204, 0);
	}

	static Color Yellow3()
	{
		return Color(255, 255, 51);
	}

	static Color Green()
	{
		return Color(0, 255, 0);
	}
	static Color Green2()
	{
		return Color(26, 255, 26);
	}
	static Color Green3()
	{
		return Color(21, 255, 21);
	}
	static Color Blue()
	{
		return Color(0, 0, 255);
	}

	static Color BlueSky1()
	{
		return Color(0, 102, 255);
	}

	static Color BlueSky2()
	{
		return Color(51, 133, 255);
	}
	static Color Pink()
	{
		return Color(255, 0, 102);
	}
	static Color Pink2()
	{
		return Color(255, 51, 153);
	}
	static Color BlueDongker()
	{
		return Color(0, 0, 102);
	}
	static Color Grey()
	{
		return Color(102, 102, 153);
	}
	static Color Silver()
	{
		return Color(230, 230, 230);
	}
	static Color Silver2()
	{
		return Color(204, 204, 204);
	}
	static Color SilverDark()
	{
		return Color(64, 64, 64);
	}
	static Color Black()
	{
		return Color(0, 0, 0);
	}
	static Color Dark2()
	{
		return Color(0, 3, 12);
	}
};

int randomer;
Color RGBBoy()
{
	randomer += 1;
	if (randomer == 0)
	{
		return Color::Red();
	}
	else if (randomer == 1)
	{
		return Color::Red();
	}
	else if (randomer == 2)
	{
		return Color::Red();
	}
	else if (randomer == 3)
	{
		return Color::Red();
	}
	else if (randomer == 4)
	{
		return Color::Red();
	}
	else if (randomer == 5)
	{
		return Color::Red();
	}
	else if (randomer == 6)
	{
		return Color::Ungu();
	}
	else if (randomer == 7)
	{
		return Color::Ungu();
	}
	else if (randomer == 8)
	{
		return Color::Ungu();
	}
	else if (randomer == 9)
	{
		return Color::Ungu();
	}
	else if (randomer == 10)
	{
		return Color::Ungu();
	}
	else if (randomer == 11)
	{
		return Color::Ungu();
	}
	else if (randomer == 12)
	{
		return Color::Ungu();
	}
	else if (randomer == 13)
	{
		return Color::Ungu();
	}
	else if (randomer == 14)
	{
		return Color::Ungu();
	}
	else if (randomer == 15)
	{
		return Color::Ungu();
	}
	else if (randomer == 16)
	{
		return Color::Ungu();
	}
	else
	{
		randomer = 0;
		return Color::Ungu();
	}
}

int randomer2;
Color RGBBoy2()
{
	randomer2 += 2;
	if (randomer2 == 0)
	{
		return Color::Red();
	}
	else if (randomer2 == 1)
	{
		return Color::Red();
	}
	else if (randomer2 == 2)
	{
		return Color::Red();
	}
	else if (randomer2 == 3)
	{
		return Color::Red();
	}
	else if (randomer2 == 4)
	{
		return Color::Red();
	}
	else if (randomer2 == 5)
	{
		return Color::Red();
	}
	else if (randomer2 == 6)
	{
		return Color::Red();
	}
	else if (randomer2 == 7)
	{
		return Color::Red();
	}
	else if (randomer2 == 8)
	{
		return Color::Red();
	}
	else if (randomer2 == 9)
	{
		return Color::Red();
	}
	else if (randomer2 == 10)
	{
		return Color::Oren();
	}
	else if (randomer2 == 11)
	{
		return Color::Oren();
	}
	else if (randomer2 == 12)
	{
		return Color::Oren();
	}
	else if (randomer2 == 13)
	{
		return Color::Oren();
	}
	else if (randomer2 == 14)
	{
		return Color::Oren();
	}
	else if (randomer2 == 15)
	{
		return Color::Oren();
	}
	else if (randomer2 == 16)
	{
		return Color::Oren();
	}
	else
	{
		randomer2 = 0;
		return Color::Oren();
	}
}

class Rect
{
  public:
	float x;
	float y;
	float width;
	float height;

	  Rect()
	{
		this->x = 0;
		this->y = 0;
		this->width = 0;
		this->height = 0;
	}

	Rect(float x, float y, float width, float height)
	{
		this->x = x;
		this->y = y;
		this->width = width;
		this->height = height;
	}

	bool operator==(const Rect & src) const
	{
		return (src.x == this->x && src.y == this->y && src.height == this->height &&
				src.width == this->width);
	}

	bool operator!=(const Rect & src)const
	{
		return (src.x != this->x && src.y != this->y && src.height != this->height &&
				src.width != this->width);
	}
};

struct Vector33
{
	float x, y, z;
};
class Vec22
{
  public:
	float x;
	float y;

	  Vec22()
	{
		this->x = 0;
		this->y = 0;
	}

	Vec22(float x, float y)
	{
		this->x = x;
		this->y = y;
	}

	static Vec22 Zero()
	{
		return Vec22(0.0f, 0.0f);
	}

	bool operator!=(const Vec22 & src)const
	{
		return (src.x != x) || (src.y != y);
	}

	Vec22 & operator+=(const Vec22 & v)
	{
		x += v.x;
		y += v.y;
		return *this;
	}

	Vec22 & operator-=(const Vec22 & v)
	{
		x -= v.x;
		y -= v.y;
		return *this;
	}
};


#endif // PUT_CHEATS_CANVAS_STRUCT_H
