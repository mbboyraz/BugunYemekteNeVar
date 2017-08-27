package com.example.hulya.yemekhane.dummydata;

import com.example.hulya.yemekhane.viewmodel.AboutUsVM;

import java.util.ArrayList;

import static com.example.hulya.yemekhane.R.drawable.boy;
import static com.example.hulya.yemekhane.R.drawable.girl;
import static com.example.hulya.yemekhane.R.drawable.icon_github;
import static com.example.hulya.yemekhane.R.drawable.icon_linkedin;


/**
 * Created by hulyacetin on 24.08.2017.
 */


public class DeveloperInformationData {

    public static ArrayList<AboutUsVM> developerDummyList() {

        ArrayList<AboutUsVM> listAboutUs = new ArrayList<>();

        AboutUsVM aboutUsVM = new AboutUsVM();
        aboutUsVM.setPerson_name("Hülya ÇETİN");
        aboutUsVM.setPerson_information("Çanakkale Onsekiz Mart Üniversitesi Bilgisayar Mühendisliği");
        aboutUsVM.setGithub_link("https://github.com/hulyacetin");
        aboutUsVM.setLinkedin_link("https://www.linkedin.com/in/h%C3%BClya-%C3%A7etin-794799136/");
        aboutUsVM.setIcon_github(icon_github);
        aboutUsVM.setIcon_linkedin(icon_linkedin);
        aboutUsVM.setPerson_photo(girl);

        listAboutUs.add(aboutUsVM);

        aboutUsVM = new AboutUsVM();
        aboutUsVM.setPerson_name("Musa Burak BOYRAZ");
        aboutUsVM.setPerson_information("İstanbul Üniversitesi Bilgisayar Mühendisliği");
        aboutUsVM.setLinkedin_link("https://www.linkedin.com/in/musa-burak-boyraz-24a481116/?ppe=1");
        aboutUsVM.setGithub_link("https://github.com/mbboyraz");
        aboutUsVM.setPerson_photo(boy);
        aboutUsVM.setIcon_github(icon_github);
        aboutUsVM.setIcon_linkedin(icon_linkedin);
        listAboutUs.add(aboutUsVM);

        return listAboutUs;
    }
}