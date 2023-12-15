package com.epam.healenium.constants;

public enum PageUrl {
    TEST_ENV_URL("https://www.google.com"),
    CALLBACK_URL("https://www.google.com"),
    MARKUP_URL("https://www.google.com");

    private final String urlName;

    PageUrl(String name) {
        this.urlName = name;
    }

    @Override
    public String toString() {
        return urlName;
    }
}
