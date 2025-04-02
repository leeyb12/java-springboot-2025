package com.leeyb98.spring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring01Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring01Application.class, args);

        // while문 - 조건이 맞지 않으면 한 번도 실행되지 않음
        int num = 10;

        while (num > 1) {
            System.out.println(num);
            num--;
        }

        // do-while문 - 조건이 맞지 않아도 한 번은 실행됨
        int cnt = 1;
        do {
            System.out.println(cnt);
            cnt++; // cnt를 1씩 증가
        } while (cnt < 10);

        System.out.println("do-while문 종료!");

        num = 1;
        // break, continue 사용 예제
        while (num < 11) {
            if (num % 2 == 0) {
                num++;  // num을 1씩 증가
                // break; // 주석 해제 시 반복문 종료
                continue; // 주석 해제 시 현재 루프 건너뛰고 다음 반복 실행
            }
            System.out.println(num);
            num++;  // num을 1씩 증가
        }

        System.out.println("break/continue 종료!");
    }
}

