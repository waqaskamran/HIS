package com.sd.his.enums;

/*
 * @author    : Irfan Nasim
 * @Date      : 18-Apr-17
 * @version   : ver. 1.0.0
 *
 * ________________________________________________________________________________________________
 *
 *  Developer				Date		     Version		Operation		Description
 * ________________________________________________________________________________________________
 *
 *
 * ________________________________________________________________________________________________
 *
 * @Project   : HIS
 * @Package   : com.sd.his.enums
 * @FileName  : ResponseEnum
 *
 * Copyright ©
 * SolutionDots,
 * All rights reserved.
 *
 */
public enum ResponseEnum {

    DATA("DATA"),
    STATUS("STATUS"),
    REASON("REASON"),
    ERROR("ERROR"),
    SUCCESS("SUCCESS"),
    WARN("WARN"),
    INFO("INFO"),
    NOT_FOUND("NOT_FOUND"),
    ADMIN_LOGGEDIN_FAILED("ADM_ERR_01"),
    ADMIN_LOGGEDIN_SUCCESS("ADM_SUC_01"),
    ADMIN_LOGGEDIN_FETCHED_FAILED("ADM_ERR_03"),
    ADMIN_LOGGEDIN_FETCHED_SUCCESS("ADM_SUC_03"),
    ADMIN_DASHBOARD_FETCHED_FAILED("ADM_ERR_04"),
    ADMIN_DASHBOARD_FETCHED_SUCCESS("ADM_SUC_04"),
    ADMIN_NOT_FOUND("ADM_ERR_02"),
    ADMIN_ACCESS_GRANTED("ADM_AUTH_SUC_01"),
    EXCEPTION("SYS_ERR_01"),
    INSUFFICIENT_PARAMETERS("SYS_ERR_02"),
    USER_LOGGED_OUT_FAILED("USR_ERR_01"),
    USER_PROFILE_IMG_UPLOAD_FAILED("USR_ERR_02"),
    USER_PROFILE_IMG_UPLOAD_SUCCESS("USR_SUC_02"),
    USER_IMG_UPLOAD_SUCCESS("USR_SUC_03"),
    USER_IMG_UPLOAD_ERROR("USR_ERR_03"),

    INSURANCE_IMG_UPLOAD_SUCCESS("INS_IMG_SUC_03"),
    INSURANCE_IMG_UPLOAD_ERROR("INS_IMG_ERR_03"),

    PATIENT_DATA_IMPORT_SUCCESS("PAT_IMP_SUC_01"),
    PATIENT_DATA_IMPORT_ERROR("PAT_IMP_ERR_02"),

    USER_PROFILE_INVALID_FILE_ERROR("USR_ERR_03"),
    USER_INVALID_FILE_ERROR("USR_ERR_04"),
    USER_LOGGED_OUT_SUCCESS("USR_AUTH_SUC_02"),
    ROLE_PERMISSION_FETCH_FAILED("ROL_PER_ERR_01"),
    ROLE_PERMISSION_FETCH_SUCCESS("ROL_PER_SUC_02"),
    ROLE_PERMISSION_ASSIGN_SUCCESS("ROL_PER_SUC_02"),
    ROLE_PERMISSION_ASSIGN_ERROR("ROL_PER_ERR_02"),

    USER_PERMISSION_FETCH_SUCCESS("USR_PER_SUC_01"),
    USER_PERMISSION_FETCH_FAILED("USR_PER_ERR_01"),

    USER_PERMISSION_ASSIGN_SUCCESS("USR_PER_SUC_02"),
    USER_PERMISSION_ASSIGN_ERROR("USR_PER_ERR_02"),

    USER_ADD_ERROR("USER_ADD_ERROR_01"),
    USER_ALREADY_EXIST_ERROR("User_Already_Exists"),
    USER_FOUND("USER_SUC_01"),
    USER_UPDATE_SUCCESS("USER_UPDATE_SUC_01)"),
    USER_UPDATE_ERROR("USER_UPDATE_ERR_01)"),
    USER_NOT_FOUND("USER_NOT_FOUND"),
    USER_ADD_SUCCESS("USER_ADD_SUCCESS_01"),
    USER_NOT_DELETED("USER_DEL_ERR_01"),
    USER_DELETED_SUCCESS("USER_DEL_SUC_01"),
    BRANCH_ADD_SUCCESS("BRANCH_ADD_SUCCESS_01"),
    BRANCH_ALREADY_EXIST_ERROR("BR_ALREADY_EXISTS_01"),
    BRANCH_NOT_FOUND("BRANCH_NOT_FOUND"),
    BRANCH_FOUND("BRANCH_SUC_01"),
    BRANCH_ADD_ERROR("BRANCH_ADD_ERR_01"),
    BRANCH_DELETED_SUCCESS("BRANCH_DEL_SUC_01"),
    BRANCH_UPDATE_ERROR("BRANCH_UPDATE_ERR_01"),
    BRANCH_UPDATE_SUCCESS("BRANCH_UPDATE_SUC_01"),
    BRANCH_NOT_DELETED("BRANCH_DEL_ERR_01"),
    BRANCH_FETCH_FAILED("BR_ERR_01"),
    BRANCH_FETCH_SUCCESS("BR_SUC_01"),
    ICD_CODE_SAVE_SUCCESS("ICD_SAVE_SUC_01"),
    ICD_CODE_SAVE_ERROR("ICD_ERR_02"),
    ICD_CODE_NOT_FOUND("ICD_ERR_03"),
    ICD_CODE_FOUND("ICD_SUC_02"),
    ICD_CODE_DELETE_SUCCESS("ICD_SUC_03"),
    ICD_CODE_DELETE_ERROR("ICD_ERR_04"),
    ICD_CODE_ALREADY_EXIST_ERROR("ICD_ERR_05"),
    ICD_CODE_UPDATE_ERROR("ICD_CODE_UPDATE_ERR_06"),
    ICD_CODE_UPDATE_SUCC("ICD_CODE_UPDATE_SUC_07"),
    ICD_CODE_HAS_CHILD("ICD_CODE_CHILD_SUC_08"),
    ICD_VERSION_ERROR("ICD_VERSION_ERROR_01"),
    ICD_VERSION_SAVE_SUCCESS("ICD_VERSION_SUC_08"),
    ICD_VERSION_ALREADY_EXIST_ERROR("ICD_VERSION_ERR_02"),
    ICD_VERSION_SAVE_ERROR("ICD_VERSION_ERR_09"),
    ICD_VERSIONS_FETCH_SUCCESS("ICD_VERSIONS_FOUND_03"),
    ICD_VERSIONS_BY_CODE_SUCCESS("ICD_VERSIONS_SUC_14"),
    ICD_VERSIONS_FOUND_SUCCESS("ICD_VERSIONS_FOUND_SUC_1"),
    ICD_VERSIONS_NOT_FOUND("ICD_VERSIONS_ERR_04"),
    ICD_VERSION_FETCH_FAILED("ICD_ERR_01"),
    ICD_VERSION_UPDATE_ERROR("ICD_VERSION_UPDATE_ERR_06"),
    ICD_VERSION_UPDATE_SUCCESS("ICD_VERSION_UPDATE_SUC_07"),
    ICD_VERSION_DELETE_SUCCESS("ICD_VERSION_DEL_SUC_11"),
    ICD_VERSION_DELETE_ERROR("ICD_VERSION_DEL_SUC_12"),
    ICD_VERSION_HAS_CHILD("ICD_VERSION_CHILD_SUC_13"),
    ICD_ASSOCIATED_FOUND_SUCCESS("ICD_ASSOCIATED_FOUND_SUC_02"),
    ICD_CODE_VERSION_DELETE_ERROR("ICD_CODE_VERSION_DEL_ERR_18"),
    ICD_CODE_VERSION_DELETE_ALREADY("ICD_CODE_VERSION_DEL_ERR_20"),
    ICD_CODE_VERSION_SAVE_SUCCESS("ICD_ASSOCIATE_SUC_18"),
    ICD_CODE_VERSION_SAVE_ERROR("ICD_CODE_VERSION_ERR_19"),
    ICD_CODE_VERSION_DELETE_SUCCESS("ICD_CODE_VERSION_DEL_SUC_17"),
    ICD_CODE_VERSION_FETCH_SUCCESS("ICD_SUC_16"),
    ICD_CODE_VERSION_NOT_FOUND("ICD_CODE_VERSION_ERR_15"),
    CLI_DPT_FETCH_SUCCESS("CLI_DPT_SUC_01"),
    CLI_DPT_FETCH_ERROR("CLI_DPT_ERR_01"),
    CLI_DPT_DELETE_SUCCESS("CLI_DPT_SUC_02"),
    CLI_DPT_DELETE_HAS_CHILD("CLI_DPT_SUC_03"),
    CLI_DPT_DELETE_DEPART_ID("CLI_DPT_SUC_04"),
    CLI_DPT_DELETE_ERROR("CLI_DPT_ERR_02"),
    CLI_DPT_SAVE_ERROR("CLI_DPT_ERR_02"),
    CLI_DPT_SAVE_SUCCESS("CLI_DPT_SUC_02"),
    CLI_DPT_ALREADY_EXIST("CLI_DPT_ERR_04"),
    CLI_DPT_UPDATE_SUCCESS("CLI_DPT_SUC_02"),
    CLI_DPT_UPDATE_ERROR("CLI_DPT_ERR_04"),
    CLI_DPT_NOT_FOUND("CLI_DPT_ERR_03"),
    ROLE_ADD_SUCCESS("ROL_SUC_01"),
    ROLE_ALREADY_EXIST_ERROR("ROL_ERR_02"),
    PERMISSION_ADD_SUCCESS("PER_SUC_01"),
    PERMISSION_ALREADY_EXIST_ERROR("PER_ERR_02"),
    SERVICE_TAX_FETCH_ERROR("SER_TAX_ERR_01"),
    SERVICE_TAX_FETCH_SUCCESS("SER_TAX_SUC_01"),
    SERVICE_TAX_DELETE_SUCCESS("SER_TAX_SUC_02"),
    SERVICE_TAX_DELETE_ERROR("SER_TAX_ERR_02"),
    SERVICE_TAX_NOT_FOUND_ERROR("SER_TAX_ERR_03"),
    SERVICE_TAX_DELETE_HAS_CHILD("SER_TAX_WAR_04"),
    SERVICE_TAX_SAVE_ERROR("SER_TAX_SAVE_ERR_06"),
    SERVICE_TAX_SAVE_SUCCESS("SER_TAX_SUC_03"),
    SERVICE_TAX_ALREADY_EXIST_ERROR("SER_TAX_ERR_04"),
    SERVICE_TAX_FROM_DATE("SER_TAX_ERR_05"),
    SERVICE_TAX_UPDATE_SUCCESS("SER_TAX_SUC_06"),
    SERVICE_TAX_SEARCH_SUCCESS("SER_TAX_SUC_07"),
    MED_SERVICE_FETCH_ERROR("MED_SER_ERR_01"),
    MED_SERVICE_FETCH_SUCCESS("MED_SER_SUC_01"),
    MED_SERVICE_DELETE_SUCCESS("MED_SER_SUC_02"),
    MED_SERVICE_DELETE_ERROR("MED_SER_ERR_02"),
    MED_SERVICE_SAVE_ERROR("MED_SER_ERR_02"),
    MED_SERVICE_SAVE_SUCCESS("MED_SER_SUC_02"),
    MED_SERVICE_ALREADY_EXIST("MED_SER_ERR_04"),
    MED_SERVICE_UPDATE_SUCCESS("MED_SER_SUC_02"),
    MED_SERVICE_NOT_FOUND("MED_SER_ERR_03"),
    MED_SERVICE_SEARCH_FOUND("MED_SER_SUC_05"),
    EMAIL_TEMPLATE_FETCH_ERROR("EMAIL_TEMP_ERR_01"),
    EMAIL_TEMPLATE_FETCH_SUCCESS("EMAIL_TEMP_SUC_02"),
    EMAIL_TEMPLATE_SAVE_ERROR("EMAIL_TEMP_ERR_03"),
    EMAIL_TEMPLATE_SAVE_SUCCESS("EMAIL_TEMP_SUC_04"),
    EMAIL_TEMPLATE_SAVE_ALREADY("EMAIL_TEMP_SUC_12"),
    EMAIL_TEMPLATE_DELETE_ERROR("EMAIL_TEMP_ERR_05"),
    EMAIL_TEMPLATE_DELETE_SUCCESS("EMAIL_TEMP_SUC_06"),
    EMAIL_TEMPLATE_UPDATE_ERROR("EMAIL_TEMP_ERR_07"),
    EMAIL_TEMPLATE_UPDATE_SUCCESS("EMAIL_TEMP_SUC_08"),
    EMAIL_TEMPLATE_UPDATE_ALREADY_DELETED("EMAIL_TEMP_SUC_11"),
    EMAIL_TEMPLATE_SEARCHED_ERROR("EMAIL_TEMP_ERR_09"),
    EMAIL_TEMPLATE_SEARCHED_SUCCESS("EMAIL_TEMP_SUC_10"),
    ORGANIZATION_SAVE_ERROR("ORG_ERR_01"),
    ORGANIZATION_UPDATE_ERROR("ORG_ERR_03"),
    ORGANIZATION_UPDATE_SUCCESS("ORG_SUC_03"),
    ORGANIZATION_ACCOUNT_FETCH_SUCCESS("ORG_SUC_04"),
    ORGANIZATION_SAVE_SUCCESS("ORG_SUC_01"),
    ORGANIZATION_FETCH_FAILED("ORG_ERR_02"),
    ORGANIZATION_FETCH_SUCCESS("ORG_SUC_02"),
    ORGANIZATION_NOT_FOUND("ORG_ERR_03"),
    ORGANIZATION_ACCOUNT_FETCH_FAILED("ORG_ERR_04"),
    ORGANIZATION_ACCOUNT_NOT_FOUND("ORG_ERR_05"),
    TIMEZONE_NOT_FOUND("TZ_ERR_01"),
    TIMEZONE_FETCH_FAILED("TZ_ERR_02"),
    TIMEZONE_FETCH_SUCCESS("TZ_SUC_01"),

    EMAIL_TEMPLATE_SEARCHED_NOT_FOUND("EMAIL_TEMP_SUC_11"),
    PATIENT_SEARCHED_NOT_FOUND("PATIENT_ERR_01"),
    PATIENT_SEARCHED_FOUND("PATIENT_SUC_02"),
    PATIENT_SAVE_ERROR("PATIENT_ERR_03"),
    PATIENT_SAVE_SUCCESS("PATIENT_SUC_04"),
    PATIENT_DELETE_ERROR("PATIENT_ERR_05"),
    PATIENT_DELETE_SUCCESS("PATIENT_SUC_06"),
    PATIENT_DELETE_ALREADY("PATIENT_SUC_18"),
    PATIENT_DELETE_CHILD("PATIENT_WRN_18"),
    PATIENT_UPDATE_ERROR("PATIENT_ERR_07"),
    PATIENT_UPDATE_SUCCESS("PATIENT_SUC_08"),
    PATIENT_SAVE_ALREADY("PATIENT_ERR_09"),
    PATIENT_UPDATE_ALREADY("PATIENT_ERR_10"),
    PATIENT_FETCHED_SUCCESS("PATIENT_SUC_11"),
    PATIENT_FETCHED_ERROR("PATIENT_ERR_12"),
    PATIENT_NOT_FOUND_ERROR("PATIENT_ERR_13"),
    PATIENT_PROBLEM_SAVE_SUCCESS("PATIENT_PROBLEM_SUC_14"),
    PATIENT_PROBLEM_SAVE_VERSION_REQUIRED("PATIENT_PROBLEM_SUC_15"),
    PATIENT_PROBLEM_SAVE_CODE_REQUIRED("PATIENT_PROBLEM_SUC_15"),
    PATIENT_PROBLEM_FETCHED_SUCCESS("PATIENT_PROBLEM_SUC_16"),
    PATIENT_PROBLEM_PATIENT_REQUIRED("PATIENT_PROBLEM_SUC_17"),
    ALLERGY_SAVE_SUCCESS("ALLERGY_SUC_17"),
    ALLERGY_PAGINATED_SUCCESS("ALLERGY_SUC_18"),
    ALLERGY_UPDATE_SUCCESS("ALLERGY_SUC_20"),
    ALLERGY_DELETE_SUCCESS("ALLERGY_SUC_22"),
    ALLERGY_GET_SUCCESS("ALLERGY_SUC_24"),
    ALLERGY_SAVE_APPOINTMENT_REQUIRED("ALLERGY_ERR_25"),
    ALLERGY_SAVE_PATIENT_REQUIRED("ALLERGY_ERR_26"),
    ALLERGY_SAVE_NAME_REQUIRED("ALLERGY_ERR_27"),
    ALLERGY_PAGINATED_STATUS_SUCCESS("ALLERGY_SUC_28"),
    /*  Medication   */
    MEDICATION_SAVE_SUCCESS("MEDICATION_SUC_28"),
    MEDICATION_SAVE_APPOINTMENT_REQUIRED("MEDICATION_ERR_29"),
    MEDICATION_SAVE_PATIENT_REQUIRED("MEDICATION_ERR_30"),
    MEDICATION_SAVE_NAME_REQUIRED("MEDICATION_ERR_31"),
    MEDICATION_PAGINATED_SUCCESS("MEDICATION_SUC_32"),
    MEDICATION_DELETE_SUCCESS("MEDICATION_SUC_33"),
    MEDICATION_GET_SUCCESS("MEDICATION_SUC_34"),
    MEDICATION_UPDATE_SUCCESS("MEDICATION_SUC_35"),
    MEDICATION_PAGINATED_STATUS_SUCCESS("MEDICATION_SUC_36"),
    /*  Documentation   */
    DOCUMENT_SAVE_SUCCESS("DOC_SUC_37"),
    DOCUMENT_SAVE_PATIENT_REQUIRED("DOC_SUC_38"),
    DOCUMENT_PAGINATED_SUCCESS("DOC_SUC_39"),
    DOCUMENT_DELETE_SUCCESS("DOC_SUC_40"),
    DOCUMENT_DELETE_ERR("DOC_SUC_41"),
    DOCUMENT_GET_SUCCESS("DOC_SUC_42"),
    DOCUMENT_GET_ERROR("DOC_SUC_43"),
    DOCUMENT_UPDATE_SUCCESS("DOC_SUC_44"),
    DOCUMENT_UPDATE_ID_REQUIRED("DOC_SUC_45"),
    DOCUMENT_SAVE_NAME_DUBPLUCATE("DOC_SUC_46"),
    /*  Documentation   */
    RACE_FETCHED_ERROR("RACE_ERR_01"),
    RACE_FETCHED_SUCESS("RACE_SUC_02"),
    APPT_FETCHED_SUCCESS("APPT_SUC_01"),
    APPT_FETCHED_ERROR("APPT_ERR_01"),
    APPT_SAVED_ERROR("APPT_ERR_02"),
    APPT_NOT_FOUND_ERROR("APPT_ERR_03"),
    APPT_UPDATE_ERROR("APPT_ERR_04"),
    APPT_SAVED_SUCCESS("APPT_SUC_02"),
    APPT_UPDATE_SUCCESS("APPT_SUC_03"),
    APPT_FOUND_SUCCESS("APPT_SUC_04"),
    APPT_NOT_DELETED("APPT_ERR_05"),
    APPT_DELETE_SUCCESS("APPT_SUC_05"),
    APPT_ALREADY_EXISTS("APPT_ERR_06"),
    DASHBOARD_FETCHED_SUCCESS("DASHBOARD_SUC_01"),
    DASHBOARD_FETCHED_ERROR("DASHBOARD_ERR_01"),
    STATUS_UPDATE_ERROR("STATUS_ERR_01"),
    STATUS_UPDATE_SUCCESS("STATUS_SUC_01"),
    DASHBOARD_NOT_FOUND_ERROR("DASHBOARD_ERR_02"),
    LABORDER_ADD_ERROR("LAB_ORDER_ERR_01"),
    LABORDER_NOT_FOUND("LAB_ORDER_ERR_02"),
    LABORDER_UPDATE_ERROR("LAB_ORDER_ERR_03"),
    LABORDER_DELETED_SUCCESS("LAB_ORDER_SUC_04"),
    LABORDER_ADD_SUCCESS("LAB_ORDER_SUC_01"),
    LABORDER_FOUND("LAB_ORDER_SUC_02"),
    LABORDER_UPDATE_SUCCESS("LAB_ORDER_SUC_03"),
    LABORDER_DELETED_FAILED("LAB_ORDER_ERR_04"),
    FAMILY_HISTORY_ADD_ERROR("FAM_HISTORY_ERR_01"),
    FAMILY_HISTORY_NOT_FOUND("FAM_HISTORY_ERR_02"),
    FAMILY_HISTORY_UPDATE_ERROR("FAM_HISTORY_ERR_03"),
    FAMILY_HISTORY_DELETED_SUCCESS("FAM_HISTORY_SUC_04"),
    FAMILY_HISTORY_ADD_SUCCESS("FAM_HISTORY_SUC_01"),
    FAMILY_HISTORY_FOUND("FAM_HISTORY_SUC_02"),
    FAMILY_HISTORY_UPDATE_SUCCESS("FAM_HISTORY_SUC_03"),
    FAMILY_HISTORY_DELETED_FAILED("FAM_HISTORY_ERR_04"),

    SMOKE_STATUS_SAVE_SUCCESS("SMOKE_STATUS_SUC_04"),
    SMOKE_STATUS_DELETE_ERROR("SMOKE_STATUS_ERR_05"),
    SMOKE_STATUS_DELETE_SUCCESS("SMOKE_STATUS_SUC_06"),
    SMOKE_STATUS_UPDATE_ERROR("SMOKE_STATUS_ERR_07"),
    SMOKE_STATUS_UPDATE_SUCCESS("SMOKE_STATUS_SUC_08"),
    SMOKE_STATUS_SAVE_ALREADY("SMOKE_STATUS_ERR_09"),
    SMOKE_STATUS_FOUND("USER_SUC_01"),
    SMOKE_STATUS_FETCHED_SUCCESS("SMOKE_STATUS_SUC_11"),
    SMOKE_STATUS_FETCHED_ERROR("SMOKE_STATUS_ERR_12"),
    INVOICE_NOT_GENERATED("INVOICE_ERR_01"),
    INVOICE_GENERATED_SUCCESS("INVOICE_SUC_01"),

    STATUS_ADD_ERROR("STATUS_ERR_01"),
    STATUS_NOT_FOUND("STATUS_ERR_02"),
    STATUS_DELETED_SUCCESS("STATUS_SUC_04"),
    STATUS_ADD_SUCCESS("STATUS_SUC_01"),
    STATUS_FOUND("STATUS_SUC_02"),
    STATUS_DELETED_FAILED("STATUS_ERR_04"),
    STATUS_ALREADY_EXIST_ERROR("STATUS_ERR_05"),


    PAYMENTTYPE_NOT_FOUND_ERROR("PAYMENT_ERR_13"),
    PAYMENTTYPE_FETCHED_ERROR("PAYMENT_ERR_12"),
    PAYMENTTYPE_UPDATE_SUCCESS("PAYMENT_SUC_03"),
    PAYMENTTYPE_DELETE_ID("PAYMENT_SUC_04"),
    PAYMENTTYPE_SAVE_SUCCESS("PAYMENT_SUC_02"),
    PAYMENTTYPE_SAVE_ERROR("PAYMENT_ERR_02"),
    PAYMENTTYPE_FETCHED_SUCCESS("PAYMENT_SUC_11"),
    PAYMENTTYPE_UPDATE_ERROR("PAYMENT_ERR_04"),
    PAYMENTTYPE_DELETE_ERROR("PAYMENT_ERR_02"),
    PAYMENTTYPE_DELETE_SUCCESS("PAYMENT_SUC_02"),
    PAYMENTTYPE_ALREADY_EXIST_ERROR("User_Already_Exists"),
    // Email COnfiguration
    EMAIL_CONFIGURATION_SAVE_SUCCESS("EMAIL_SAVE_SUCCESS"),
    EMAIL_CONFIGURATION_SAVE_ERROR("EMAIL_SAVE_ERR"),

    EMAIL_CONFIGURATION_UPDATE_SUCCESS("EMAIL_UPDATE_SUCCESS"),
    EMAIL_CONFIGURATION_UPDATE_ERROR("EMAIL_UPDATE_ERR"),

    EMAIL_CONFIGURATION_FETCHED_SUCCESS("EMAIL_FETCHED_SUCCESS"),
    EMAIL_CONFIGURATION_FETCHED_ERROR("EMAIL_FETCHED_ERR"),

    /*  Drug   */
    DRUG_SAVE_SUCCESS("DRUG_SUC_1"),
    DRUG_SAVE_ERROR("DRUG_ERROR_2"),
    DRUG_SAVE_NAME_REQUIRED("DRUG_SUC_3"),
    DRUG_SAVE_NAME_DUBPLUCATE("DOC_SUC_4"),
    DRUG_PAGINATED_SUCCESS("DRUG_SUC_5"),
    DRUG_DELETE_SUCCESS("DRUG_SUC_6"),
    DRUG_DELETE_ERR("DRUG_ERR_7"),
    DRUG_GET_PAGINATED_SUCCESS("DRUG_SUC_8"),
    DRUG_GET_ERROR("DRUG_ERR_9"),
    DRUG_GET_SUCCESS("DRUG_SUC_10"),
    DRUG_UPDATE_SUCCESS("DRUG_SUC_11"),
    DRUG_UPDATE_ID_REQUIRED("DRUG_SUC_12"),
    DRUG_UPDATE_NAME_REQUIRED("DRUG_SUC_13"),
    DRUG_UPDATE_URL_REQUIRED("DRUG_SUC_14"),
    DRUG_GET_NATURAL_ID_SUCCESS("DRUG_SUC_15"),
    /*  Documentation   */

    /*  Patient Group   */
    PATIENT_GROUP_SAVE_SUCCESS("PATGRP_SUC_1"),
    PATIENT_GROUP_SAVE_ERROR("PATGRP_ERROR_2"),
    PATIENT_GROUP_SAVE_NAME_REQUIRED("PATGRP_SUC_3"),
    PATIENT_GROUP_SAVE_NAME_DUBPLUCATE("PATGRP_SUC_4"),
    PATIENT_GROUP_FETCH_SUCCESS("PATGRP_SUC_5"),
    PATIENT_GROUP_GET_SUCCESS("PATGRP_SUC_6"),
    PATIENT_GROUP_UPDATE_SUCCESS("PATGRP_SUC_7"),
    PATIENT_GROUP_UPDATE_ERROR("PATGRP_ERRPR_8"),
    PATIENT_GROUP_DELETE_CHILD("PATGRP_WARN_9"),
    PATIENT_GROUP_DELETE_SUCCESS("PATGRP_SUC_10"),

    /*  Currency  */
    CURRENCY_SAVE_SUCCESS("CURRENCY_SUC_1"),
    CURRENCY_SAVE_ERROR("CURRENCY_ERROR_2"),
    CURRENCY_SAVE_IOS_REQUIRED("CURRENCY_WARN_3"),
    CURRENCY_SAVE_IOS_DUBPLUCATE("CURRENCY_WARN_4"),
    CURRENCY_SAVE_SYMBOL_REQUIRED("CURRENCY_WARN_11"),
    CURRENCY_PAGINATED_SUCCESS("CURRENCY_SUC_12"),
    CURRENCY_PAGINATED_ERROR("CURRENCY_ERROR_13"),
    CURRENCY_GET_SUCCESS("CURRENCY_SUC_5"),
    CURRENCY_GET_ERROR("CURRENCY_ERROR_6"),
    CURRENCY_GET_ID_REQUIRED("CURRENCY_ERROR_14"),
    CURRENCY_UPDATE_SUCCESS("CURRENCY_SUC_7"),
    CURRENCY_UPDATE_ID_REQUIRED("CURRENCY_ERROR_8"),
    CURRENCY_UPDATE_ERROR("CURRENCY_ERROR_8"),
    CURRENCY_DELETE_CHILD("CURRENCY_WARN_9"),
    CURRENCY_DELETE_SUCCESS("CURRENCY_SUC_10"),
    CURRENCY_DELETE_ID_REQUIRED("CURRENCY_ERROR_15"),
    CURRENCY_GET_DEFAULT_SUCCESS("CURRENCY_SUC_16"),


    //Countries Message Bundle
    COUNTRY_NOT_FOUND_ERROR("COUNTRY_ERR_13"),
    COUNTRY_FETCHED_ERROR("COUNTRY_ERR_12"),
    COUNTRY_UPDATE_SUCCESS("COUNTRY"),
    COUNTRY_DELETE_ID("COUNTRY_SUC_04"),
    COUNTRY_SAVE_SUCCESS("COUNTRY_SUC_02"),
    COUNTRY_SAVE_ERROR("COUNTRY_ERR_02"),
    COUNTRY_FETCHED_SUCCESS("COUNTRY_SUC_11"),
    COUNTRY_UPDATE_ERROR("COUNTRY_ERR_04"),
    COUNTRY_DELETE_ERROR("COUNTRY_ERR_02"),
    COUNTRY_DELETE_SUCCESS("COUNTRY_SUC_02"),


    //////////////////State
    STATE_NOT_FOUND_ERROR("STATE_ERR_13"),
    STATE_FETCHED_ERROR("STATE_ERR_12"),
    STATE_UPDATE_SUCCESS("STATE"),
    STATE_DELETE_ID("STATE_SUC_04"),
    STATE_SAVE_SUCCESS("STATE_SUC_02"),
    STATE_SAVE_ERROR("STATE_ERR_02"),
    STATE_FETCHED_SUCCESS("STATE_SUC_11"),
    STATE_UPDATE_ERROR("STATE_ERR_04"),
    STATE_DELETE_ERROR("STATE_ERR_02"),
    STATE_DELETE_SUCCESS("STATE_SUC_02"),

    ////////////////////City
    CITY_NOT_FOUND_ERROR("CITY_ERR_13"),
    CITY_FETCHED_ERROR("CITY_ERR_12"),
    CITY_UPDATE_SUCCESS("CITY"),
    CITY_DELETE_ID("CITY_SUC_04"),
    CITYCOUNTRY_SAVE_SUCCESS("CITY_SUC_02"),
    CITYSAVE_ERROR("CITY_ERR_02"),
    CITY_FETCHED_SUCCESS("CITY_SUC_11"),
    CITY_UPDATE_ERROR("CITY_ERR_04"),
    CITY_DELETE_ERROR("CITY_ERR_02"),
    CITY_DELETE_SUCCESS("CITY_SUC_02"),
    DATEFORMAT_NOT_FOUND_ERROR("DATEFORMAT_ERR_13"),
    ORGANIZATIONDATA_FETCH_FAILED("ORG_ERR_02"),
    ORGANIZATIONDATA_FETCH_SUCCESS("ORG_SUC_01"),
    DATEFORMAT_FETCHED_SUCCESS("DATEFORMAT_SUC_11"),

    GENERAL_LEDGER_DELETE_SUCCESS("GL_DEL_SUC_01"),
    GENERAL_LEDGER_DELETE_ERROR("GL_DEL_ERR_02"),
    GENERAL_LEDGER_NOT_FOUND_ERROR("GL_DEL_ERR_03"),
    ORDER_UPDATE_ID_REQUIRED("ORD_SUC_45"),
    ;



    private String value;

    ResponseEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
