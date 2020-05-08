/*
  betahouse.us
  CopyRight (c) 2012 - 2020
 */
package leetcode;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author MessiahJK
 * @version : T386LexicographicalNumbers.java 2020/05/08 16:52 MessiahJK
 */
public class T386LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        Set<String> set=new TreeSet<>();
        for(int i=1;i<=n;i++){
            set.add(String.valueOf(i));
        }
        return set.stream().map(Integer::valueOf).collect(Collectors.toList());
    }
}
