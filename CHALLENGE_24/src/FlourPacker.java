public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
      if((bigCount*5+smallCount*1<goal)||bigCount*smallCount*goal<0)
          return false;
      else if(goal%5<=smallCount)
          return true;
      else
          return false;
    }
}
