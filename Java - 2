class Clock{
int hr,min,sec;
Clock()
{
hr=12;
min=0;
sec=0;
}
Clock(int x,int y,int z)
{
hr=x;
min=y;
sec=z;
}
Clock(int x)
{
hr=x/3600;
x=x%3600;
min=x/60;
x=x%60;
sec=x;
}
void setClock(int x)
{
hr=x/3600;
x=x%3600;
min=x/60;
x=x%60;
sec=x;
}

int getHours()
{
 return hr;
}

int getMinutes()
{
 return min;
}

int getSeconds()
{
 return sec;
}

void setHours(int x)
{
 hr=x;
}

void setMinutes(int x)
{
 min=x;
}

void setSeconds(int x)
{
 sec=x;
}

void tick()
{ 
 sec++;
 System.out.println(hr+"hrs "+min+"min "+sec+"sec");
}

void addClock(Clock c)
{
 this.hr=this.hr+c.hr;
 this.min=this.min+c.min;
 this.sec=this.sec+c.sec;
}

String tostring()
{
 return "(hr:min:sec)";
}

void tickDown()
{
 sec--;
 System.out.println(hr+"hrs "+min+"min "+sec+"sec");
}

Object subtractClock(Clock c)
{
 c.hr = c.hr-this.hr;
 c.min= c.min-this.min;
 c.sec= c.sec-this.min;
 return c;
}
}

class ClockDemo{
public static void main(String args[])
{
 Clock firstClock = new Clock(3600);
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 firstClock.tick();
 Clock secondClock = new Clock(1,30,45);
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 secondClock.tick();
 firstClock.addClock( secondClock );
 System.out.println(firstClock.toString());
 System.out.println(secondClock.toString()); 
 Clock thirdClock=new Clock(0,0,0);
 thirdClock=firstClock.subtractClock(secondClock);
}
}
