package model;

public class StudyClass {
    private String studyClassName;
    private int studyClassRoom;
    private Boolean onSite;
    private String responsibleName;
    private String responsiblePhone;

    public String getStudyClassName() {
        return studyClassName;
    }

    public void setStudyClassName(String studyClassName) {
        this.studyClassName = studyClassName;
    }

    public int getStudyClassRoom() {
        return studyClassRoom;
    }

    public void setStudyClassRoom(int studyClassRoom) {
        this.studyClassRoom = studyClassRoom;
    }

    public Boolean getOnSite() {
        return onSite;
    }

    public void setOnSite(Boolean onSite) {
        this.onSite = onSite;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getResponsiblePhone() {
        return responsiblePhone;
    }

    public void setResponsiblePhone(String responsiblePhone) {
        this.responsiblePhone = responsiblePhone;
    }
}
