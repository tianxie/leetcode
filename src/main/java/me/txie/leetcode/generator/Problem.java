package me.txie.leetcode.generator;

public class Problem {

    private String packageName;
    private String problemName;
    private String problemSignature;
    private String utilPackage;
    private String problemUrl;

    public String getUtilPackage() {
        return utilPackage;
    }

    public void setUtilPackage(String utilPackage) {
        this.utilPackage = utilPackage;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getProblemSignature() {
        return problemSignature;
    }

    public void setProblemSignature(String problemSignature) {
        this.problemSignature = problemSignature;
    }

    public String getProblemUrl() {
        return problemUrl;
    }

    public void setProblemUrl(String problemUrl) {
        this.problemUrl = problemUrl;
    }
}
