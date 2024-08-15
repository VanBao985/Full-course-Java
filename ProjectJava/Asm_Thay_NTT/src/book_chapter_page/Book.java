package book_chapter_page;

import java.util.ArrayList;
import java.util.Iterator;

public class Book {
    private ArrayList<Chapter> chapters;
    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }
    public int countChapter(){
        return chapters.size();
    }
    public int countPage(){
        int cnt = 0;
        for (Iterator<Chapter> i=chapters.iterator(); i.hasNext();){
            Chapter chapter = i.next();
            cnt += chapter.countPage();
        }
        return cnt;
    }
}
