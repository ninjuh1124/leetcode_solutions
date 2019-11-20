class Solution {
    public int romanToInt(String s) {
        int number = 0;
        Stack<Character> chars = new Stack<>();
        char roman;

        for (int i=0; i < s.length(); i++) {
            chars.push(s.charAt(i));
        }

        while (!chars.empty()) {
            roman = chars.pop();
            switch (roman) {
                case 'I':
                    number += 1;
                    break;

                case 'V':
                    if (!chars.empty()) {
                        if (chars.peek() == 'I') {
                            number += 4;
                            chars.pop();
                        } else {
                            number += 5;
                        }
                    }
                    else {
                        number += 5;
                    }
                    break;

                case 'X':
                    if (!chars.empty()) {
                        if (chars.peek() == 'I') {
                            number += 9;
                            chars.pop();
                        } else {
                            number += 10;
                        }
                    }
                    else {
                        number += 10;
                    }
                    break;

                case 'L':
                    if (!chars.empty()) {
                        if (chars.peek() == 'X') {
                            number += 40;
                            chars.pop();
                        } else {
                            number += 50;
                        }
                    }
                    else {
                        number += 50;
                    }
                    break;

                case 'C':
                    if (!chars.empty()) {
                        if (chars.peek() == 'X') {
                            number += 90;
                            chars.pop();
                        } else {
                            number += 100;
                        }
                    }
                    else {
                        number += 100;
                    }
                    break;

                case 'D':
                    if (!chars.empty()) {
                        if (chars.peek() == 'C') {
                            number += 400;
                            chars.pop();
                        } else {
                            number += 500;
                        }
                    }
                    else {
                        number += 500;
                    }
                    break;

                case 'M':
                    if (!chars.empty()) {
                        if (chars.peek() == 'C') {
                            number += 900;
                            chars.pop();
                        } else {
                            number += 1000;
                        }
                    }
                    else {
                        number += 1000;
                    }
                    break;
            }
        }

        return number;
    }
}
