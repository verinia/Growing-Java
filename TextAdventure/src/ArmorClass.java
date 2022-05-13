public class ArmorClass {

    //Light armor
    ArmorConstructor leatherArmor = new ArmorConstructor(11,10,0, false,
            false,10);
    ArmorConstructor studdedLeather = new ArmorConstructor(12, 45,0,false,
            false,13);
    ArmorConstructor padded = new ArmorConstructor(11, 5,0, false,
            true,8);

    //Medium armor
    ArmorConstructor hide = new ArmorConstructor(12,10,0, false,
            false,12);
    ArmorConstructor breastplate = new ArmorConstructor(14,400,0, false,
            false,20);
    ArmorConstructor chainShirt = new ArmorConstructor(13,50,0, false,
            false,20);
    ArmorConstructor halfPlate = new ArmorConstructor(15, 750,0,false,
            true,40);
    ArmorConstructor scaleMail = new ArmorConstructor(14,50,0,false,
            true,45);

    //Heavy armor
    ArmorConstructor ringMail = new ArmorConstructor(14, 30,0,false,
            true,40);
    ArmorConstructor chainMail = new ArmorConstructor(16, 75,0,false,
            true,55);
    ArmorConstructor splint = new ArmorConstructor(17, 200,0,false,
            true,60);
    ArmorConstructor plate = new ArmorConstructor(18,1200,0, false,
            true,65);

    //Shield
    ArmorConstructor shield = new ArmorConstructor(2,10,0, false,
            false,6);


}
