package uz.jl.temp.modul;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {

    public int TwoSumNumber(int a,int b){
        return a+b;
    }

    public static void test(){
        System.out.println("Hello test");
    }
}
