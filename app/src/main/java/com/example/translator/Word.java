package com.example.translator;


public class Word {
    private String mEnglishWordTranslation ;
    private String mBanglaWordTranslation;

    public Word(String englishWordTranslation, String banglaWordTranslation) {
        this.mEnglishWordTranslation = englishWordTranslation;
        this.mBanglaWordTranslation = banglaWordTranslation;
    }

    public String getmEnglishWordTranslation() {
        return mEnglishWordTranslation;
    }

    public void setmEnglishWordTranslation(String mEnglishWordTranslation) {
        this.mEnglishWordTranslation = mEnglishWordTranslation;
    }

    public String getmBanglaWordTranslation() {
        return mBanglaWordTranslation;
    }

    public void setmBanglaWordTranslation(String mBanglaWordTranslation) {
        this.mBanglaWordTranslation = mBanglaWordTranslation;
    }
}
