package book_chapter_page;

import java.util.ArrayList;

public class Chapter {
    private ArrayList<Page> pages;
    public void addPage(Page page){
        pages.add(page);
    }
    public int countPage(){
        return pages.size();
    }
}
