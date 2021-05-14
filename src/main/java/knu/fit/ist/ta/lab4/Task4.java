
package knu.fit.ist.ta.lab4;

import java.util.List;
import java.util.regex.Matcher;
import java.util.Set;

/**
 *
 * @author HP-Notebook
 */
public class Task4 {
    Matcher matcher;
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
       StringProcessing sp = new StringProcessing();
       StringMatching sm = new StringMatching();
       List list = sp.getList(sp.text);
       Set set = sp.getSet(sp.text);
  
       
       System.out.println(list);
       System.out.println(list.size());
       System.out.println("=====================");
       System.out.println(set);
       System.out.println(set.size());
       System.out.println("==========find6MostFrequentWords===========");
       System.out.println(sp.get8FirstWords(sp.text));
       System.out.println("============findAmountOfWordsWithoutV=========");
       System.out.println(sp.getAmountWithoutS(sp.getText()));
       
       System.out.println("=========findAmountOfWordsWith3UniqueLet============");
       System.out.println(sp.getAmountWords4Letters(sp.getText()));
       
       System.out.println("===========find4MostPopular3Sequences==========");
       System.out.println(sp.getFiveMostPopularWords3Letters(sp.getText()));
  
    }
}