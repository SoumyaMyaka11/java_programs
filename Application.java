import java.util.Scanner;
class Application
{
   public static void main(String args[])
   {
          Scanner s = new Scanner(System.in);
          double total_amount=0;
          int total_cate1=0,total_cate2=0,total_cate3=0,total_cate4=0,total_cate5=0,total_cate6=0,total_cate7=0,total_cate8=0;
          int press;
          System.out.println("_____________________________________________________");
          System.out.println();
          System.out.println("            WELCOME TO NATURE'S CART                 ");
          System.out.println("_____________________________________________________");
          System.out.println();
          System.out.println();
          System.out.println("WE PROVIDE THE FOLLOWING CATEGORIES OF DAILY ESSENTIALS");
          System.out.println();
          do{
          System.out.println("___________");
          System.out.println("MAIN MENU");
          System.out.println("-----------");
          System.out.println("1.GRAINS & STAPLES \n"+"2.OILS & GHEE \n"+"3.SPICES \n"+"4.DRY FRUITS & NUTS \n"+"5.DAIRY & BEVERAGES \n"+"6.PACKAGED FOODS \n"+"7.PERSONAL CARE\n"+"8.STATIONARY");
       System.out.println();
        /*System.out.println("PRESS 1 TO CONTINUE SHOPPING AND 0 TO EXIT FROM MAIN MENU");
        int button = s.nextInt();
        if(button == 1){}
        else if(button ==0)
        {
            break;
        } 
       System.out.println("\n");*/  
       System.out.println("SELECT THE CATEGORY YOU WANTED TO VISIT");
       int category = s.nextInt();
       System.out.println();
       switch(category)
       {
          case 1:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED GRAINS & STAPLES. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY ");
               System.out.println("\n");
               int n;
               int basmati_total=0 ,brown_total=0,sonamasoori_total=0,
                blackrice_total=0,wheat_total=0,maida_total=0;
               do{
               System.out.println("TYPE                 PRICE(per kg in Rs)\n"+
                                  "1.Basmati Rice           150\n"+
                                  "2.Brown Rice             100\n"+
                                  "3.Sona Massori Rice      80\n"+
                                  "4.Black Rice             250\n"+
                                  "5.Wheat Flour            60\n"+
                                  "6.Maida                  65\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break;
               System.out.println();     
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();
               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED BASMATI RICE\n");
                 System.out.println("ENTER THE QUANTITY");
                 int quantity = s.nextInt();
                 basmati_total = quantity*150;
                 
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED BROWN RICE \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 brown_total = quantity*100;
                
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED SONA MASOORI RICE \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 sonamasoori_total = quantity*80;
                
                }
                else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED BLACK RICE \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 blackrice_total = quantity*250;
                 
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED WHEAT \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 wheat_total = quantity*60;
                 
               }
               else if(item == 6)
               {
                 System.out.println("YOU HAVE SELECTED MAIDA \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 maida_total = quantity*65;
                 
               }

               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE GRIANS AND STAPLES CATEGORY");
                n = s.nextInt();
                System.out.println();
             }while(n==1);
             total_cate1 = basmati_total+brown_total+sonamasoori_total+blackrice_total+wheat_total+maida_total;
             //System.out.println("total amount to be paid in GRAINS AND STAPLES is "+ total_cate1);
             break;  
               
           }
         case 2:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED OILS & GHEE. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY");
               System.out.println("\n");
               int n;
               int freedom_total=0 ,fortune_total=0,goldwinner_total=0,amulghee_total=0,aachi_total=0;
               do{
               System.out.println("TYPE                                 PRICE(per litre/kg in Rs)\n"+
                                  "1.Freedom Refined Sunflower Oil           140\n"+
                                  "2.Fortune Oil                             160\n"+
                                  "3.Gold Winner                             150\n"+
                                  "4.Amul Pure Ghee                          290\n"+
                                  "5.Aachi Ghee                              160\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break; 
               System.out.println();
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();

               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED FREEDOM REFINED SUNFLOWER OIL\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 freedom_total = quantity*140;
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED FORTUNE OIL\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 fortune_total = quantity*160;
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED GOLD WINNER OIL\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 goldwinner_total= quantity*150;
               }
               else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED AMUL PURE GHEE\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 amulghee_total= quantity*290;
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED AACHI GHEE\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 aachi_total  = quantity*160;
               }
               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE OILS & GHEE CATEGORY");
                n = s.nextInt();
                System.out.println();
             }while(n==1);
             total_cate2 = freedom_total+fortune_total+goldwinner_total+amulghee_total+aachi_total;
             //System.out.println("total amount to be paid in OILS & GHEE is "+ total_cate2);
             break;  
               
         }

       case 3:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED SPICES. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY");
               System.out.println("\n");
               int n;
               int redchilli_total=0 ,turmeric_total=0,pepper_total=0,cardamom_total=0,cloves_total=0,cinnamon_total=0;
               do{
               System.out.println("TYPE                                 PRICE(per kg in Rs)\n"+
                                  "1.Red chilli powder                       260\n"+
                                  "2.Turmeric powder                         170\n"+
                                  "3.Black pepper                            1000\n"+
                                  "4.Green cardamom                          350\n"+
                                  "5.Black cloves                            140\n"+
                                  "6.Cinnamon stick                          130\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break; 
               System.out.println();
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();

               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED RED CHILLI POWDER\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 redchilli_total = quantity*260;
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED TUMERIC POWDER\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 turmeric_total = quantity*170;
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED BLACK PEPPER \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 pepper_total= quantity*1000;
               }
               else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED GREEN CARDAMOM\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 cardamom_total = quantity*290;
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED BLACK CLOVES\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 cloves_total = quantity*160;
               }
                else if(item == 6)
               {
                 System.out.println("YOU HAVE SELECTED CINNAMON STICK\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 cinnamon_total = quantity*160;
               }

               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE OILS & GHEE CATEGORY");
                n = s.nextInt();
                System.out.println();
             }while(n==1);
             total_cate3 = redchilli_total+turmeric_total+pepper_total+cardamom_total+cloves_total+cinnamon_total;
             //System.out.println("total amount to be paid in SPICES is "+ total_cate3);
             break;  
        }
    
     case 4:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED DRY FRUITS AND NUTS. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY");
               System.out.println("\n");
               int n;
               int almond_total=0 ,cashew_total=0, walnuts_total=0,figs_total=0,dates_total=0,mixeddry_total=0;
               do{
               System.out.println("TYPE                                 PRICE(per kg in Rs)\n"+
                                  "1.Almonds                                 1250\n"+
                                  "2.Cashew nuts                             3000\n"+
                                  "3.Walnuts                                 780\n"+
                                  "4.Figs                                    1000\n"+
                                  "5.Dates                                   700\n"+
                                  "6.Mixed dry fruits                        1250\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break; 
               System.out.println();
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();

               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED ALMONDS\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 almond_total = quantity*1250;
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED CASHEW NUTS\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 cashew_total = quantity*3000;
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED WALNUTS \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 walnuts_total= quantity*780;
               }
               else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED FIGS\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 figs_total = quantity*1000;
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED DATES\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 dates_total = quantity*700;
               }
                else if(item == 6)
               {
                 System.out.println("YOU HAVE SELECTED MIXED DRY FRUITS\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 mixeddry_total = quantity*1250;
               }

               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE SPICES");
                n = s.nextInt();
                System.out.println();
             }while(n==1);
             total_cate4 = almond_total+cashew_total+ walnuts_total+figs_total+dates_total+mixeddry_total;
             //System.out.println("total amount to be paid in SPICES is "+ total_cate4);
             break;  
        }
   
    case 5:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED DAIRY AND BEVERAGES. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY");
               System.out.println("\n");
               int n;
               int mtoned_total=0 ,mcowmilk_total=0, mbuffalomilk_total=0,amulmilk_total=0,delight_total=0,thumsup_total=0,sprite_total=0,maaza_total=0,cola_total=0,pepsi_total=0,fanta_total=0;
               do{
               System.out.println("TYPE                                 PRICE(per litre in Rs)\n"+
                                  "1.Mother Dairy Toned Milk                 56\n"+
                                  "2.Mother Dairy Cow Milk                   58\n"+
                                  "3.Mother Dairy Buffalo Milk               72\n"+
                                  "4.Amul Milk                               70\n"+
                                  "5.Country Delight  Milk                   60\n"+
                                  "6.Thumsup                                 52\n"+
                                  "7.Sprite                                  52\n"+
                                  "8.Maaza                                   50\n"+
                                  "9.Coca-Cola                               44\n"+
                                  "10.Pepsi                                  27\n"+
                                  "11.Fanta                                  52\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break; 
               System.out.println();
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();

               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED MOTHER DAIRY TONED MILK\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 mtoned_total = quantity*56;
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED MOTHER DAIRY COW MILK\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 mcowmilk_total= quantity*58;
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED MOTHER DAIRY BUFFALO MILK\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 mbuffalomilk_total= quantity*72;
               }
               else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED AMUL MILK\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 amulmilk_total = quantity*70;
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED COUNTRY DELIGHT MILK\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                delight_total = quantity*60;
               }
                else if(item == 6)
               {
                 System.out.println("YOU HAVE SELECTED THUMSUP\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 thumsup_total= quantity*52;
               }
                else if(item == 7)
               {
                 System.out.println("YOU HAVE SELECTED SPRITE\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 sprite_total = quantity*52;
               }
               else if(item == 8)
               {
                 System.out.println("YOU HAVE SELECTED MAAZA\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 maaza_total = quantity*50;
               }
               else if(item == 9)
               {
                 System.out.println("YOU HAVE SELECTED COCA-COLA\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 cola_total = quantity*44;
               }
               else if(item == 10)
               {
                 System.out.println("YOU HAVE SELECTED PEPSI\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 sprite_total = quantity*27;
               }
               else if(item == 11)
               {
                 System.out.println("YOU HAVE SELECTED FANTA\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 sprite_total = quantity*52;
               }

               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE DAIRY AND BEVERAGES");
                n = s.nextInt();
                System.out.println();
             }while(n==1);

             total_cate5 = mtoned_total+mcowmilk_total+mbuffalomilk_total+amulmilk_total+delight_total+thumsup_total+sprite_total+maaza_total+cola_total+
pepsi_total+fanta_total;
             //System.out.println("total amount to be paid in DAIRY AND BEVERAGES is "+ total_cate5);
             break;  
        }
     case 6:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED PACKAGED FOODS. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY");
               System.out.println("\n");
               int n;
               int parleg_total=0 ,gooday_total=0, bourbon_total=0,maggi_total=0,yippe_total=0,chips_total=0, dairymilk_total=0,kitkat_total=0,mixedjam=0,peanut_total=0;
               do{
               System.out.println("TYPE                                 PRICE(per pack in Rs)\n"+
                                  "1.Parle-G                                 10\n"+
                                  "2.Good Day                                30\n"+
                                  "3.Bourbon                                 10\n"+
                                  "4.Maggi                                   12\n"+
                                  "5.Yippe                                   15\n"+
                                  "6.Potato Chips                            20\n"+
                                  "7.Cadbury Dairy Milk                      45\n"+
                                  "8.Kitkat                                  20\n"+
                                  "9.Kissan Mixed Friut Jam                  120\n"+
                                  "10.Kissan Peanut Butter                   150\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break; 
               System.out.println();
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();

               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED PARLE-G\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 parleg_total = quantity*10;
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED GOOD DAY\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 gooday_total = quantity*30;
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED BOURBON \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 bourbon_total= quantity*10;
               }
               else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED MAGGI\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 maggi_total = quantity*12;
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED YIPPE\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 yippe_total = quantity*15;
               }
                else if(item == 6)
               {
                 System.out.println("YOU HAVE SELECTED POTATO CHIPS\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 chips_total = quantity*20;
               }
                else if(item == 7)
               {
                 System.out.println("YOU HAVE SELECTED CADBURY DAIRY MILK\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 dairymilk_total = quantity*45;
               }
                else if(item == 8)
               {
                 System.out.println("YOU HAVE SELECTED KITKAT\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 kitkat_total = quantity*20;
               }
                else if(item == 9)
               {
                 System.out.println("YOU HAVE SELECTED KISSAN MIXED FRUIT JAM\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 mixedjam = quantity*120;
               }
                else if(item == 10)
               {
                 System.out.println("YOU HAVE SELECTED KISSAN PEANUT BUTTER\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 peanut_total = quantity*150;
               }


               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE PACKAGED FOODS");
                n = s.nextInt();
                System.out.println();
             }while(n==1);
             total_cate6 = parleg_total+gooday_total+bourbon_total+maggi_total+yippe_total+chips_total+dairymilk_total+kitkat_total+mixedjam+peanut_total;
             //System.out.println("total amount to be paid in SPICES is "+ total_cate6);
             break;  
        }
     case 7:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED DRY PERSONAL CARE. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY");
               System.out.println("\n");
               int n;
               int nivea_total=0 ,ponds_total=0, himalaya_total=0,mamaearth_total=0,dove_total=0,earthonion_total=0,dotnkey_total=0,aqua_total=0;
               do{
               System.out.println("TYPE                                 PRICE(per pack in Rs)\n"+
                                  "1.Nivea Moisturizer                       299\n"+
                                  "2.Ponds Moisturizer                       250\n"+
                                  "3.Himalaya Neem Facewash                  170\n"+
                                  "4.Mamaearth Ricewater Facewash            300\n"+
                                  "5.Dove Shampoo                            250\n"+
                                  "6.Mamaearth Onion Shampoo                 250\n"+
                                  "7.Dot&Key Sunscreen                       280\n"+
                                  "8.Aqualogia Sunscreen                     450\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break; 
               System.out.println();
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();

               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED NIVEA MOISTURIZER\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 nivea_total = quantity*299;
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED PONDS MOISTURIZER\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 ponds_total = quantity*250;
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED HIMALAYA NEEM FACE WASH \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 himalaya_total= quantity*170;
               }
               else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED MAMAEARTH RICE WATER FACEWASH\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 mamaearth_total = quantity*300;
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED DOVE SHAMPOO\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 dove_total = quantity*250;
               }
                else if(item == 6)
               {
                 System.out.println("YOU HAVE SELECTED MAMAEARTH ONION SHAMPOO\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 earthonion_total = quantity*250;
               }
                else if(item == 7)
               {
                 System.out.println("YOU HAVE SELECTED DOT & KEY SUNSCREEN\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 dotnkey_total = quantity*280;
               }
               else if(item == 8)
               {
                 System.out.println("YOU HAVE SELECTED AQUALOGIA SUNSCREEN\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 aqua_total = quantity*450;
               }


               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE PERSONAL CARE");
                n = s.nextInt();
                System.out.println();
             }while(n==1);
             total_cate7 =nivea_total+ponds_total+himalaya_total+mamaearth_total+dove_total+earthonion_total+dotnkey_total+aqua_total;
             //System.out.println("total amount to be paid in PERSONAL CARE is "+ total_cate7);
             break;  
        }
    case 8:{
               System.out.println("________________________________________________________________________________________________________________\n");
               System.out.println("YOU HAVE SELECTED STATIONARY. HERE WE PROVIDE THE FOLLOWING TYPES ALONG WITH THEIR PRICE IN THIS CATEGORY");
               System.out.println("\n");
               int n;
               int bpen_total=0 ,gpen_total=0, pencil_total=0,eraser_total=0,sharpner_total=0,book_total=0,stickynote_total=0,highlighter_total=0,
                 color_total=0,sketch_total=0;
               do{
               System.out.println("TYPE                                 PRICE(per each item in Rs)\n"+
                                  "1.Ballpoint pen                            10\n"+
                                  "2.Gel pen                                  10\n"+
                                  "3.pencil                                   8\n"+
                                  "4.Eraser                                   5\n"+
                                  "5.Sharpner                                 10\n"+
                                  "6.Notebooks                                50\n"+
                                  "7.Sticky Notes                             50\n"+
                                  "8.Highlighters                             20\n"+
                                  "9.Watercolor set                           100\n"+
                                  "10.Sketch pens set                         120\n");
System.out.println("_____________________________________________________________________________________________________________________ \n");
               System.out.println("PRESS 1 TO CONTINUE TO SHOP THIS CATEGORY AND 0 TO EXIT FROM THIS CATEGORY");
               int p = s.nextInt();
               if(p == 1){}
               else if(p==0)
                    break; 
               System.out.println();
               System.out.println("CHOOSE THE ITEM(S) YOU WANTED TO PURCHASE");
               int item = s.nextInt();
               System.out.println();

               if(item == 1)
               {
                 System.out.println("YOU HAVE SELECTED BALLPOINT PEN\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 bpen_total = quantity*10;
               }
               else if(item == 2)
               {
                 System.out.println("YOU HAVE SELECTED GEL PEN\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 gpen_total = quantity*10;
               }
               else if(item == 3)
               {
                 System.out.println("YOU HAVE SELECTED PENCIL \n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 pencil_total= quantity*8;
               }
               else if(item == 4)
               {
                 System.out.println("YOU HAVE SELECTED EARESER\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 eraser_total = quantity*5;
               }
               else if(item == 5)
               {
                 System.out.println("YOU HAVE SELECTED SHARPNER\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 sharpner_total = quantity*10;
               }
                else if(item == 6)
               {
                 System.out.println("YOU HAVE SELECTED NOTEBOOKS\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 book_total = quantity*50;
               }
               else if(item == 7)
               {
                 System.out.println("YOU HAVE SELECTED STICKEY NOTES\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 stickynote_total = quantity*50;
               }
               else if(item == 8)
               {
                 System.out.println("YOU HAVE SELECTED HIGHLIGHTERS\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 highlighter_total = quantity*20;
               }
               else if(item == 9)
               {
                 System.out.println("YOU HAVE SELECTED WATER COLOR SET\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 color_total = quantity*100;
               }
               else if(item == 10)
               {
                 System.out.println("YOU HAVE SELECTED SKETCH PENS SET\n");
                 System.out.println("ENTER THE QUANTITY:");
                 int quantity = s.nextInt();
                 sketch_total = quantity*120;
               }


               System.out.println();
               System.out.println("PRESS 1 TO REVISIT PREVIOUS MENU AND 0 TO EXIT FROM THE STATIONARY");
               n = s.nextInt();
                System.out.println();

             }while(n==1);
             total_cate8 = bpen_total+gpen_total+pencil_total+eraser_total+sharpner_total+book_total+stickynote_total+highlighter_total+
                 color_total+sketch_total;

             //System.out.println("total amount to be paid in SPICES is "+ total_cate8);
             break;  
        }


     }

        System.out.println();
        System.out.println("PRESS 1 TO REVISIT MAIN MENU AND 0 TO EXIT FROM DIFFERENT CATEGORIES");
         press = s.nextInt();
         System.out.println();

      }while(press==1);
      
      total_amount = total_cate1 + total_cate2 + total_cate3 + total_cate4 + total_cate5 + total_cate6 + total_cate7+total_cate8;
      double tax = (double)total_amount*10/100;
      double total_bill_amount = total_amount + tax;
      System.out.println("TOTAL AMOUNT IS     :"+total_amount+"\n"+
                          "GST IS             :"+tax+"\n"+
                          "TOTAL BILL AMOUNT  :"+total_bill_amount);



   }
}