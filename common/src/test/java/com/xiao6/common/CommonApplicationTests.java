package com.xiao6.common;

import com.xiao6.coupon.mapper.model.Coupon;
import com.xiao6.coupon.service.CouponService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CommonApplicationTests {


    private CouponService couponService;


    public void save() {

        for (int i = 0; i < 1000; i++) {
            Coupon coupon = new Coupon();
            couponService.save(coupon);
        }

    }


    public static void write() throws IOException {
        Set<String> randomSet = randomSet(6000);

        List<String> list = new ArrayList<>(randomSet);

        File file = new File("c:/softs/coupon_card_" + 1_1000 + ".txt");
        if (!file.exists())
            file.createNewFile();
        FileWriter out = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(out);
        for (int i = 0; i < 1000; i++) {
            bw.write("FZ" + list.get(i) + "," + list.get(i + 3000));
            bw.newLine();
        }
        bw.flush();
        bw.close();


        File file1 = new File("c:/softs/coupon_card_" + 1001_2000 + ".txt");
        if (!file1.exists())
            file1.createNewFile();
        FileWriter out1 = new FileWriter(file1);
        BufferedWriter bw1 = new BufferedWriter(out1);
        for (int i = 1000; i < 2000; i++) {
            bw1.write("FZ" + list.get(i) + "," + list.get(i + 3000));
            bw1.newLine();
        }
        bw1.flush();
        bw1.close();



        File file2 = new File("c:/softs/coupon_card_" + 2001_3000 + ".txt");
        if (!file2.exists())
            file2.createNewFile();
        FileWriter out2 = new FileWriter(file2);
        BufferedWriter bw2 = new BufferedWriter(out2);
        for (int i = 2000; i < 3000; i++) {
            bw2.write("FZ" + list.get(i) + "," + list.get(i + 3000));
            bw2.newLine();
        }
        bw2.flush();
        bw2.close();
    }

    public static String random(int length) {
        return String.valueOf(Math.random()).substring(2, 2 + length);
    }

    public static Set<String> randomSet(int size) {

        Set<String> rst = new HashSet<>();
        boolean flag = true;
        while (flag) {
            rst.add(random(10));
            if (rst.size() >= size) {

                flag = false;
            }
        }

        return rst;
    }

    public static void main(String[] args) {
        try {
            write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void contextLoads() {
    }

}
