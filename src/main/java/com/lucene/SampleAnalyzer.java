package com.lucene;

/**
 * Created by seoky on 2016-10-04.
 */
public class SampleAnalyzer {
    private static final char[] CHOSUNG = {'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
    private static final char[] JUNGSUNG = {'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'};
    private static final char[] JONGSUNG = {'\u0000', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};

    public static void main(String ... args) throws Exception {
        String input = "모두 나를 가지고 매일 가만 안 두죠 내가 너무 예쁘죠 나 때문에 다 힘들죠 어딜 걷고 있어도 빨간 바닥인거죠 Red carpet 같은 기분 모두 날 쳐다 보죠 oh 어떤 사람은 어머님이 누구냐고 신선하게 말 걸어도 아무 느낌이 안 들죠 하지만 나도 누군가 하고 사랑에 빠져보고 싶어 Baby 잘 들어요 내 Boy 단 한번도 느껴본 적 없는 걸 알게 해주는  (사람 기다리고 있는 걸) 얼마가 돼도 기다리고 싶어 I just wanna fall in love 어떻게 내가 움직일 수 없게  날 Ooh Ahh Ooh Ahh 하게 만들어줘 가짜 가짜 진심 없는 가짜  잘 가 잘 가 Huh (OOH-AHH하게) 어떻게 이제 더 할말이 없게  날 Ooh Ahh Ooh Ahh 하게 만들어줘 Bla La La La 말만하지 말고  느껴지게 Huh (OOH-AHH하게) 날 봐 거봐 또 두 번 봐 한번 지나치고 등을 돌려 쳐다봐 (TWICE) 어딜 가더라도 항상 민 낯 하지만 내가 제일 빛나 낮은 신발 신어도 가치는 High 머릿속엔 늘 영화 속 같은 La La La 장면들이 지나가네 생각만해도 떨리네 yeah 이제는 나도 누군가 하고 사랑에  빠져 보고 싶어 Baby 잘 들어요 내 Boy 단 한번도 느껴본 적 없는 걸 알게 해주는  (사람 기다리고 있는 걸) 얼마가 돼도 기다리고 싶어 I just wanna fall in love 어떻게 내가 움직일 수 없게  날 Ooh Ahh Ooh Ahh 하게 만들어줘 가짜 가짜 진심 없는 가짜  잘 가 잘 가 Huh (OOH-AHH하게) 어떻게 이제 더 할말이 없게  날 Ooh Ahh Ooh Ahh 하게 만들어줘 Bla La La La 말만하지 말고  느껴지게 Huh (OOH-AHH하게) 아무하고 만나 시작하기 싫어  쉽지 않은 여자 그게 나인걸  Let me see How you gon treat me I ain’t no easy Better think about it TWICE 어떻게 내가 움직일 수 없게  날 Ooh Ahh Ooh Ahh 하게 만들어줘 가짜 가짜 진심 없는 가짜  잘 가 잘 가 Huh (OOH-AHH하게) 어떻게 이제 더 할말이 없게  날 Ooh Ahh Ooh Ahh 하게 만들어줘 Bla La La La 말만하지 말고  느껴지게 Huh ";

        for(int i=0; i<input.length(); i++) {
            String result = "";

            char ch = input.charAt(i);

            if(ch >= 0xAC00 && ch <= 0xD7A3) {
                int cho = (ch - 0xAC00) / (21 * 28);
                int jung = ((ch - 0xAC00) % (21 * 28)) / 28;
                int jong = ((ch - 0xAC00) % (21 * 28)) % 28;

                if(jong == 0)
                    result += String.format("%c %c ", CHOSUNG[cho], JUNGSUNG[jung]);
                else
                    result += String.format("%c %c %c ", CHOSUNG[cho], JUNGSUNG[jung], JONGSUNG[jong]);

                System.out.println(result);
            }
        }
    }
}
