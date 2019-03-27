package com.company;

public class BitCoinLogo {
    public static void printBitCoinLogo() throws InterruptedException {
        String bitcoinLogo= "MMMMMMMMMMMMMWNKOxddddxk0NWMMMMMMMMMMMMM\n" +
                "MMMMMMMMMWKxl;,'',,,,,''',;lxKWMMMMMMMMM\n" +
                "MMMMMMWKo,.':oxOKXXNXXXKOxo:'.,oKWMMMMMM\n" +
                "MMMMW0c..ckXWMNKKNWXKKXWMMMWXkc..c0WMMMM\n" +
                "MMMXl..oKWMMMMk.'kXc..cNMMMMMMWKo..lXMMM\n" +
                "MMK;.;0WMKdooo,  ,c.  .lox0NMMMMW0;.;KMM\n" +
                "MK; cXMMMk,.     ......    ,OWMMMMXc ;KM\n" +
                "Nl ;XMMMMWNXo.  .oXXXXKl.   ,KMMMMMX; lN\n" +
                "O..kMMMMMMMMO.  .xMMMMWk.   ;KMMMMMMk..O\n" +
                "x.,KMMMMMMMMO.   ,lccl:.   :0MMMMMMMK,.x\n" +
                "d ,KMMMMMMMMO.   .,,,,,.   .:OWMMMMMK, d\n" +
                "k..OMMMMMMMMO.  .dWWWWWXx.   'OMMMMMO..k\n" +
                "X; oWMMMMMMMk.  .xMMMMMWO'   .kMMMMWl ;X\n" +
                "Mk..xWMMMKoc'    'cccc:,.   .lNMMMWx..kM\n" +
                "MWx..xNMMO;'''.  ..    .',:oOWMMMNx..xWM\n" +
                "MMWk'.:0WWNNNNo  d0,  ;KWWMMMMMW0:.'kWMM\n" +
                "MMMMXl..cONMMMKddKNkooONMMMMMNOc..lXMMMM\n" +
                "MMMMMWKo,.,lkKNWMMMMMMMMWN0xl,.,oKWMMMMM\n" +
                "MMMMMMMMNOo;''';:cllllc:;'.';oONMMMMMMMM\n" +
                "NNNNNNNNNNWNKOxolc::::cloxkKNWNNNWWWWNNN\n"  ;
        char [] pixels =bitcoinLogo.toCharArray();
        for (int i = 0; i <pixels.length ; i++) {
            Thread.sleep(15);
            System.out.printf(String.valueOf(pixels[i]));
        }
    }
}
