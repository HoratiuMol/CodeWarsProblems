public class UnflattenAList_Easy {
            public static Object[] unflatten(int[] flatArray)
            {
                //flatArray= new int[]{1, 2, 3, 5, 4, 2, 4, 3, 6};

                Object[] objeto= new Object[]{};

                for(int i=0; i<flatArray.length;){

                    if(flatArray[i]<3){
                        objeto[i]=flatArray[i];
                        i++;
                    }else{

                        int tama=flatArray[i];

                        int[] int1=new int[]{tama};

                        for(int j=0;j<tama;j++){

                            int1[j]=flatArray[i];
                            i++;
                        }

                        objeto[i]=int1;
                        //i=i+tama;

                    }

                }

                return objeto;

    }
}
