package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditManagementRecordResponse
 */
public class CreditManagementRecordResponse   {
  private String managedPositionReference = null;

  private String managedPositionType = null;

  private String transactionReference = null;

  private String transactionType = null;

  private Object transactionRecord = null;

  private String transactionRecordAmount = null;

  private String transactionRecordValueDate = null;

  private String transactionRecordBookingEntity = null;

  private String recordingRecordReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return managedPositionReference
  **/

  public String getManagedPositionReference() {
    return managedPositionReference;
  }

  public void setManagedPositionReference(String managedPositionReference) {
    this.managedPositionReference = managedPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return managedPositionType
  **/

  public String getManagedPositionType() {
    return managedPositionType;
  }

  public void setManagedPositionType(String managedPositionType) {
    this.managedPositionType = managedPositionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return transactionReference
  **/

  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionType
  **/

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return transactionRecord
  **/

  public Object getTransactionRecord() {
    return transactionRecord;
  }

  public void setTransactionRecord(Object transactionRecord) {
    this.transactionRecord = transactionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return transactionRecordAmount
  **/

  public String getTransactionRecordAmount() {
    return transactionRecordAmount;
  }

  public void setTransactionRecordAmount(String transactionRecordAmount) {
    this.transactionRecordAmount = transactionRecordAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date 
   * @return transactionRecordValueDate
  **/

  public String getTransactionRecordValueDate() {
    return transactionRecordValueDate;
  }

  public void setTransactionRecordValueDate(String transactionRecordValueDate) {
    this.transactionRecordValueDate = transactionRecordValueDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return transactionRecordBookingEntity
  **/

  public String getTransactionRecordBookingEntity() {
    return transactionRecordBookingEntity;
  }

  public void setTransactionRecordBookingEntity(String transactionRecordBookingEntity) {
    this.transactionRecordBookingEntity = transactionRecordBookingEntity;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return recordingRecordReference
  **/

  public String getRecordingRecordReference() {
    return recordingRecordReference;
  }

  public void setRecordingRecordReference(String recordingRecordReference) {
    this.recordingRecordReference = recordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

