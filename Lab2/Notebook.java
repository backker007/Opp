package Lab2;

import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        int i = 1;
        Set S = new Set();
        S.AllPage(50);
        try (Scanner Keyboard = new Scanner(System.in)) {
            System.out.println("Choice 0 : End Program!!!\nChoice 1 : OpenFirstPage\nchoice 2 : OpenLastPage\nchoice 3 : OpenPagSelect\n"
            + "Choice 4 : OpenPageOnBookmark\nChoice 5 : NextPage\nChoice 6 : PreviousPage\nChoice 7 : SetBookmark\n"
            +"Choice 8 : ShowPageAll\nChoice 9 : ShowCurrentPage\nChoice 10 ShowPageOnBookmark"
            );
            do {
                System.out.print("Choice : ");
                i = Keyboard.nextInt();
                switch (i) {
                    case 1: S.FirstPage();
                        break;
                    case 2: S.LastPage();
                        break;
                    case 3:
                    System.out.print("SelectPage :"); 
                    S.OpenPage(Keyboard.nextInt());
                        break;
                    case 4: S.OpenPagebookmark();
                        break;
                    case 5: S.NextPage();
                        break;
                    case 6: S.PreviousPage();
                        break;
                    case 7: 
                    System.out.println("Set Bookmark :");
                    S.Bookmarks(Keyboard.nextInt());
                        break;
                    case 8: S.ShowPageAll();
                        break;
                    case 9: S.ShowCurrentPage();
                        break;
                    case 10: S.ShowPageOnBookmark();
                        break;
                    case 0:
                        System.out.println("Press 0 To Close The Program...");
                        break;
                    default:
                    System.out.println("Choice 0 - 10 This Time");
                        break;
                }
            } while (i > 0);
        }
        System.out.println("Java Program End...");
    }
}
