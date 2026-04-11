public enum MemberStatus {
    ACTIVE(true)
    ,SUSPEND(false);
    boolean isActive= false;
    MemberStatus(boolean isActive) {
        this.isActive =isActive;
    }
}
