public class OnBoardComputer implements BurnStream {
private boolean freeFall = true;
    @Override
    public int getNextBurn(DescentEvent status) {
          int burn = 0;
//        if(status.getVelocity()<=0)
//            burn = 99 - status.getVelocity();
//        else if (status.getVelocity()<3)burn = 100;
//        else if (status.getVelocity()==3)burn =101;
//        else if (status.getAltitude()<status.getVelocity()*10) {
//            if(status.getVelocity()>100){
//                burn = 200;
//            }else{
//                burn = 100 + (status.getVelocity()/4);
//            }
//            freeFall = false;
//        }
//        else if (!freeFall) {
//            burn = 100;
//        }


        System.out.println(burn); /*hack!*/
        System.out.println(status.Fuel);
        return burn;
    }

}
