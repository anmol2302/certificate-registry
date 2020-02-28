package org.sunbird.message;

/**
 * This interface will hold all the response key and message
 *
 * @author Amit Kumar
 */
public interface IResponseMessage extends IUserResponseMessage, IOrgResponseMessage {

  String INVALID_REQUESTED_DATA = "INVALID_REQUESTED_DATA";
  String INVALID_OPERATION_NAME = "INVALID_OPERATION_NAME";
  String INTERNAL_ERROR = "INTERNAL_ERROR";
  String SERVER_ERROR = "SERVER_ERROR";
  String UNAUTHORIZED = "UNAUTHORIZED";
  String ID_ALREADY_EXISTS="ID_ALREADY_EXISTS";
  String MISSING_MANDATORY_PARAMS ="MISSING_MANDATORY_PARAMS";
  String DATA_TYPE_ERROR="DATA_TYPE_ERROR";
  String EMPTY_MANDATORY_PARAM="EMPTY_MANDATORY_PARAM";
  String INVALID_ID_PROVIDED="INVALID_ID_PROVIDED";
  String INVALID_PROVIDED_URL="INVALID_PROVIDED_URL";
  String INVALID_RELATED_TYPE="INVALID_RELATED_TYPE";
  String INVALID_RECIPIENT_TYPE="INVALID_RECIPIENT_TYPE";
  String INVALID_PROPERTY_ERROR = "INVALID_PROPERTY_ERROR";
  String DB_UPDATE_FAIL = "DB_UPDATE_FAIL";
  String DB_INSERTION_FAIL = "DB_INSERTION_FAIL";
  String INVALID_CONFIGURATION = "INVALID_CONFIGURATION";
  String RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";


}
