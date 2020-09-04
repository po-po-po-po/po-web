package com.po.pf;

import com.po.pf.regex.RegexUtils;

/**
 * @Auther wangzekun
 * @Date 2020/9/4 11:08
 * @Description
 */
public class Ptcs {
    public static void main(String[] args) {
        String s="werrHTTP1.1eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJkdXJhdGlvbiI6NzIwMCwiZGlzcGxheU5hbWUiOiJwb3BvIiwiaXNzIjoiY2xvdWRpaXAtYmFzaWMtcGxhdGZvcm0iLCJ0ZW5hbnRJZCI6IjEzNTIyNzE1ODk2IiwiZXhwIjoxNTk5MTk2MDcwLCJ1c2VySWQiOiJsRTFINEJSU18xNTk1ODE0MTc0ODE3XzMiLCJqdGkiOiI0NmE2MDhjNC03YTMxLTQ4ZTYtODJhNi1hN2E1NDQ5Y2E4YmMiLCJ1c2VybmFtZSI6InBvcG8ifQ.DyNkYPXI9shi4RTU1ve8zUoVySxVZuG7beKIrworZ-gbHI-ZyM0ApoIZKYffCJnscGZ9tJqwWt1PU616zIEBEci2leaZJHMMx5CUdPrBtDFCwnnzNzO_9F3nXzA56XRdsmfqYVg_QI56mSSQUXh2dX1-XqZAgXDkTfKRgv_lSZA";
        String aa= RegexUtils.filterDangerString(s);
        System.out.println(s.length());
        System.out.println(aa.length());
    }

}
