package com.report;

import com.report.Reportable;

public class NormalReporter implements Reportable {
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
