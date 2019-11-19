import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Image> list = new ArrayList();
        ListIterator<Image> iterator;
        Scanner s = new Scanner(System.in);
        boolean suunta = true;
        boolean exit = false;

        String imgName = "HiRes_10MB_Photo";
        for (int i = 0; i < 10; i++){
            list.add(new ProxyImg(imgName + (i+1)));
        }

        System.out.println("Kuvat: ");
        list.forEach(Image::showData);
        System.out.println("");

            iterator = list.listIterator();

            while (!exit) {
                System.out.println("e: edellinen, s: seuraava, l: lopeta");

                switch (s.next()) {
                    case "s":
                    	if (iterator.hasNext()){
                            iterator.next().displayImage();
                    	}
                    	else {
                            System.out.println("Ei ole enään seuraavaa kuvaa.");
                        }
                        break;

                    case "e":
                    	if (iterator.hasPrevious()){
                            iterator.previous().displayImage();
                    	}
                        else {
                            System.out.println("Ei ole enään edellistä kuvaa.");
                        }
                        break;

                    case "l":
                        exit = true;
                        break;

                    default:
                        System.out.println("Valitse s, e tai l");
                        break;
                }
            }
        }
    }