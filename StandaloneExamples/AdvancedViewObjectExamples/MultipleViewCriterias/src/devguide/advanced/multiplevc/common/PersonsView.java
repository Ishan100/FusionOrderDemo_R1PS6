package devguide.advanced.multiplevc.common;

import oracle.jbo.ViewObject;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---------------------------------------------------------------------
public interface PersonsView extends ViewObject {
    void setbv_PersonTypeCode(String value);

    void setbv_Gender(String value);

    String getbv_PersonTypeCode();

    String getbv_Gender();

    void showMaleCustomers();

    void showFemaleStaff();

    void showFemaleCustomers();

    void showAll();
}