package com.irinayanushkevich.practice.task5.memento_project;

public class SafeArticleRunner {

    public static void main(String[] args) throws InterruptedException {

        Article article = new Article();
        GoogleDisk googleDisk = new GoogleDisk();

        System.out.println("Writing an article part 1.");
        article.setVersionAndDate("Part 1");
        System.out.println(article);

        System.out.println("Editor approved part 1. Saving this version on Google-disk.");
        googleDisk.setSafe(article.safe());

        Thread.sleep(2000);

        System.out.println("Writing the article part 2 and making changes in the part 1.");
        article.setVersionAndDate("Part 2");
        System.out.println(article);

        System.out.println("Editor rejected part 2 of the article and asked return all to first version.");
        System.out.println("Rolling back to version part 1 before changes.");
        article.load(googleDisk.getSafe());

        System.out.println("Article after rollback");
        System.out.println(article);
    }
}
