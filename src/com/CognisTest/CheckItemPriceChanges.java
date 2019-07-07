package com.CognisTest;

public class CheckItemPriceChanges {

    public static void main(String[] args) {

         String originalItems[]={"rice","sugar","wheat","cheese"};
         Double origPrices[]={16.89,56.92,20.89,345.99};
         String item[]={"rice","cheese","wheat"};
         Double prices[]={16.99,400.89,21.78};

//        String item[]={"rice"};
//        Double prices[]={18.99};
        int change=checkItemPricesChanges(originalItems,origPrices,item,prices);
        System.out.println("chnage====>"+change);
    }



    public static int checkItemPricesChanges(String[] originalItems, Double[] origPrices, String[] item, Double[] prices) {

        int count=0;
        for (int i = 0; i < originalItems.length; i++) {

            for (int j = 0; j < item.length; j++) {

                if(originalItems[i].equalsIgnoreCase(item[j])){

                    System.out.println("origPrices[i]=========>"+origPrices[i]);
                    System.out.println("prices[j]=========>"+prices[j]);
                    if(!origPrices[i].equals(prices[j])){

                        count++;
                    }
                }

            };

        }

        return  count;
    }
}

