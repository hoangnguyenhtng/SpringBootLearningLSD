package demoWebServices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BasicService {
    public String helloStudent(String name){
        return "Hello: " + name;
    }

    public int cong(int a, int b){
        return a + b;
    }

    public String normalizeName(String fullName){
        StringTokenizer stk = new StringTokenizer(fullName.toLowerCase());
        List<String> list = new ArrayList<String>();
        while (stk.hasMoreElements()){
            list.add(stk.nextToken());
        }

        fullName = "";
        for(String string : list){
            String upper = string.toUpperCase();
            string = string.replaceFirst(string.charAt(0) + "", upper.charAt(0)+"");
            fullName = fullName + string + " ";
        }
        fullName = fullName.trim();
        return fullName;
    }
    public String createEmail(String fullname){
        String fullName = normalizeName(fullname);
        StringTokenizer stk = new StringTokenizer(fullName);
        List<String> list = new ArrayList<>();
        while (stk.hasMoreElements()){
            list.add(stk.nextToken());
        }
        String email = list.get(list.size()-1);
        for(int i = 0 ;i < list.size()-1 ; i++){
            email = email + list.get(i).charAt(0);
        }
        email = email + "@gmail.com";
        return email.toLowerCase();
    }
}
