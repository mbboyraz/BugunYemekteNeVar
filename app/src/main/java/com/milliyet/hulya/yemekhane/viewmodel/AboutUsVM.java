package com.milliyet.hulya.yemekhane.viewmodel;

public class AboutUsVM {


    public int person_photo;
    public String person_name;
    public String person_information;
    public String linkedin_link;
    public String github_link;
    public int icon_github, icon_linkedin;

    public int getIcon_github() {
        return icon_github;
    }

    public void setIcon_github(int icon_github) {
        this.icon_github = icon_github;
    }

    public int getIcon_linkedin() {
        return icon_linkedin;
    }

    public void setIcon_linkedin(int icon_linkedin) {
        this.icon_linkedin = icon_linkedin;
    }

    public String getGithub_link() {
        return github_link;
    }

    public void setGithub_link(String github_link) {
        this.github_link = github_link;
    }

    public String getLinkedin_link() {
        return linkedin_link;
    }

    public void setLinkedin_link(String linkedin_link) {
        this.linkedin_link = linkedin_link;
    }


    public int getPerson_photo() {
        return person_photo;
    }

    public void setPerson_photo(int person_photo) {
        this.person_photo = person_photo;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_information() {
        return person_information;
    }

    public void setPerson_information(String person_information) {
        this.person_information = person_information;
    }

}
