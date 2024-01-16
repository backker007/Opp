package Lab2;

public class Set {
    private int All;
    private int Current;
    private int Bookmark;

    public void AllPage(int a) {
        this.All = a;
        this.Current = 1;
        this.Bookmark = 0;
        System.out.println("All Page Is : " + this.All);
    }

    int FirstPage() {
        System.out.println("Now On Page : 1");
        return this.Current = 1;
    }

    int LastPage (){
        System.out.println("Now On Page : " + this.All);
        return this.Current = this.All;
    }
    int OpenPage(int a) {
        if ((0 < a) && (a <= this.All)) {
            this.Current = a;
            System.out.println("Now On Page :" + this.Current);
        } else {
            System.out.println("Error Because Page Not Found!!!");
        }
        return this.Current;
    }

    int OpenPagebookmark() {
        if (this.Bookmark > 0) {
            System.out.println("Now On Page :" + this.Bookmark);
        } else {
            System.out.println("Error Because Page Not Found!!!");
        }
        return this.Current = this.Bookmark;
    }

    int NextPage() {
        this.Current++;
        if (this.Current <= this.All) {
            System.out.println("Now On Page :" + this.Current);
        } else {
            System.out.println("Error Because Page Not Found!!!");
            this.Current--;
        }
        return this.Current;
    }

    int PreviousPage() {
        this.Current--;
        if (this.Current >= 0) {
            System.out.println("Now On Page :" + this.Current);
        } else {
            System.out.println("Error Because Page Not Found!!!");
            this.Current++;
        }
        return this.Current;
    }

    int Bookmarks(int a) {
        if ((0 < a) && (a <= this.All)) {
            this.Bookmark = a;
            System.out.println("Now Set On Page :" + this.Bookmark);
        } else {
            System.out.println("Error Because Page Not Found!!!");
        }
        return this.Bookmark;
    }
    void ShowPageAll (){
        System.out.println("Total "+this.All+" Page");
    }
    void ShowCurrentPage (){
        System.out.println("Current Page :"+this.Current);
    }
    void ShowPageOnBookmark (){
        System.out.println("Now Set Bookmark On Page :" + this.Bookmark);
    }
}
