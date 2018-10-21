package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CreditPosition
 */
public class CreditPosition   {
  private String managedPositionReference = null;

  private String managedPositionType = null;

  private String customerReference = null;

  private String sectorReference = null;

  private String productReference = null;


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
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return sectorReference
  **/

  public String getSectorReference() {
    return sectorReference;
  }

  public void setSectorReference(String sectorReference) {
    this.sectorReference = sectorReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productReference
  **/

  public String getProductReference() {
    return productReference;
  }

  public void setProductReference(String productReference) {
    this.productReference = productReference;
  }


}

