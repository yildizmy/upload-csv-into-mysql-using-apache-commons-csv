package com.github.yildizmy.common;

import java.time.format.DateTimeFormatter;

public class Constants {

    public static final String TRACE = "trace";
    public static final String[] SUPPORTED_CONTENT_TYPES =  {"text/csv", "application/vnd.ms-excel"};
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("M/d/yyyy"); // set as the date field in csv file

    // TODO: Move to message.properties file after applying i18n
    public static final String SUCCESSFULLY_UPLOADED="File uploaded successfully: ";
    public static final String SUCCESSFULLY_DELETED="Successfully deleted.";
    public static final String VALIDATION_ERROR="Validation error. Check 'errors' field for details.";
    public static final String FAILED_TO_FIND_ELEMENT="Failed to find the requested element.";
    public static final String INVALID_FILE_TYPE="Invalid file type.";
    public static final String UNKNOWN_ERROR="Unknown error occurred.";
    public static final String NO_RECORD="File does not contain any record.";
    public static final String FAILED_TO_PARSE="Failed to parse csv file: ";
    public static final String NO_ITEM_FOUND="Item with given email not found.";
}
