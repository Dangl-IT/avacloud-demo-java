/*
 * AVACloud API 1.55.0
 * AVACloud API specification
 *
 * OpenAPI spec version: 1.55.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.danglit.avacloud.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.danglit.avacloud.client.models.DeliveryInformation;
import com.danglit.avacloud.client.models.InvoiceAllowance;
import com.danglit.avacloud.client.models.InvoiceCharge;
import com.danglit.avacloud.client.models.InvoiceLineItem;
import com.danglit.avacloud.client.models.InvoiceNote;
import com.danglit.avacloud.client.models.InvoicePeriod;
import com.danglit.avacloud.client.models.InvoiceTotals;
import com.danglit.avacloud.client.models.InvoiceType;
import com.danglit.avacloud.client.models.Organization;
import com.danglit.avacloud.client.models.Payee;
import com.danglit.avacloud.client.models.PaymentInstructions;
import com.danglit.avacloud.client.models.PreviousInvoice;
import com.danglit.avacloud.client.models.References;
import com.danglit.avacloud.client.models.SourceType;
import com.danglit.avacloud.client.models.SupportingDocument;
import com.danglit.avacloud.client.models.VatBreakdown;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an invoice
 */
@ApiModel(description = "This class represents an invoice")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-11T12:55:14.413Z")
public class Invoice {
  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("invoiceDate")
  private OffsetDateTime invoiceDate = null;

  @SerializedName("invoiceType")
  private InvoiceType invoiceType = null;

  @SerializedName("currencyCode")
  private String currencyCode = null;

  @SerializedName("paymentDueDate")
  private OffsetDateTime paymentDueDate = null;

  @SerializedName("references")
  private References references = null;

  @SerializedName("paymentTerms")
  private String paymentTerms = null;

  @SerializedName("previousInvoices")
  private List<PreviousInvoice> previousInvoices = null;

  @SerializedName("buyer")
  private Organization buyer = null;

  @SerializedName("seller")
  private Organization seller = null;

  @SerializedName("payee")
  private Payee payee = null;

  @SerializedName("invoiceNotes")
  private List<InvoiceNote> invoiceNotes = null;

  @SerializedName("invoicePeriod")
  private InvoicePeriod invoicePeriod = null;

  @SerializedName("deliveryInformation")
  private DeliveryInformation deliveryInformation = null;

  @SerializedName("totals")
  private InvoiceTotals totals = null;

  @SerializedName("paymentInstructions")
  private PaymentInstructions paymentInstructions = null;

  @SerializedName("documents")
  private List<SupportingDocument> documents = null;

  @SerializedName("vatBreakdown")
  private List<VatBreakdown> vatBreakdown = null;

  @SerializedName("allowances")
  private List<InvoiceAllowance> allowances = null;

  @SerializedName("charges")
  private List<InvoiceCharge> charges = null;

  @SerializedName("lineItems")
  private List<InvoiceLineItem> lineItems = null;

  @SerializedName("sourceType")
  private SourceType sourceType = null;

  public Invoice invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * The number of the invoice
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "The number of the invoice")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public Invoice invoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * The date of the invoice
   * @return invoiceDate
  **/
  @ApiModelProperty(value = "The date of the invoice")
  public OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public Invoice invoiceType(InvoiceType invoiceType) {
    this.invoiceType = invoiceType;
    return this;
  }

   /**
   * The type of the invoice
   * @return invoiceType
  **/
  @ApiModelProperty(value = "The type of the invoice")
  public InvoiceType getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(InvoiceType invoiceType) {
    this.invoiceType = invoiceType;
  }

  public Invoice currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The three letter ISO currency code
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The three letter ISO currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public Invoice paymentDueDate(OffsetDateTime paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
    return this;
  }

   /**
   * Until when the payment is due
   * @return paymentDueDate
  **/
  @ApiModelProperty(value = "Until when the payment is due")
  public OffsetDateTime getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(OffsetDateTime paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
  }

  public Invoice references(References references) {
    this.references = references;
    return this;
  }

   /**
   * An object holding reference used in this invoice
   * @return references
  **/
  @ApiModelProperty(value = "An object holding reference used in this invoice")
  public References getReferences() {
    return references;
  }

  public void setReferences(References references) {
    this.references = references;
  }

  public Invoice paymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
    return this;
  }

   /**
   * A text description of payment terms, e.g. cash discounts or payment conditions
   * @return paymentTerms
  **/
  @ApiModelProperty(value = "A text description of payment terms, e.g. cash discounts or payment conditions")
  public String getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(String paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  public Invoice previousInvoices(List<PreviousInvoice> previousInvoices) {
    this.previousInvoices = previousInvoices;
    return this;
  }

  public Invoice addPreviousInvoicesItem(PreviousInvoice previousInvoicesItem) {
    if (this.previousInvoices == null) {
      this.previousInvoices = new ArrayList<>();
    }
    this.previousInvoices.add(previousInvoicesItem);
    return this;
  }

   /**
   * In case of partial or final invoices, it&#39;s possible to reference the previous invoice numbers
   * @return previousInvoices
  **/
  @ApiModelProperty(value = "In case of partial or final invoices, it's possible to reference the previous invoice numbers")
  public List<PreviousInvoice> getPreviousInvoices() {
    return previousInvoices;
  }

  public void setPreviousInvoices(List<PreviousInvoice> previousInvoices) {
    this.previousInvoices = previousInvoices;
  }

  public Invoice buyer(Organization buyer) {
    this.buyer = buyer;
    return this;
  }

   /**
   * Information about the buyer
   * @return buyer
  **/
  @ApiModelProperty(value = "Information about the buyer")
  public Organization getBuyer() {
    return buyer;
  }

  public void setBuyer(Organization buyer) {
    this.buyer = buyer;
  }

  public Invoice seller(Organization seller) {
    this.seller = seller;
    return this;
  }

   /**
   * Information about the seller
   * @return seller
  **/
  @ApiModelProperty(value = "Information about the seller")
  public Organization getSeller() {
    return seller;
  }

  public void setSeller(Organization seller) {
    this.seller = seller;
  }

  public Invoice payee(Payee payee) {
    this.payee = payee;
    return this;
  }

   /**
   * A payee is someone who receives the payment that is different from the seller
   * @return payee
  **/
  @ApiModelProperty(value = "A payee is someone who receives the payment that is different from the seller")
  public Payee getPayee() {
    return payee;
  }

  public void setPayee(Payee payee) {
    this.payee = payee;
  }

  public Invoice invoiceNotes(List<InvoiceNote> invoiceNotes) {
    this.invoiceNotes = invoiceNotes;
    return this;
  }

  public Invoice addInvoiceNotesItem(InvoiceNote invoiceNotesItem) {
    if (this.invoiceNotes == null) {
      this.invoiceNotes = new ArrayList<>();
    }
    this.invoiceNotes.add(invoiceNotesItem);
    return this;
  }

   /**
   * If present, this is an unstructured text that can be used to give additional information about the invoice. Field BG-1
   * @return invoiceNotes
  **/
  @ApiModelProperty(value = "If present, this is an unstructured text that can be used to give additional information about the invoice. Field BG-1")
  public List<InvoiceNote> getInvoiceNotes() {
    return invoiceNotes;
  }

  public void setInvoiceNotes(List<InvoiceNote> invoiceNotes) {
    this.invoiceNotes = invoiceNotes;
  }

  public Invoice invoicePeriod(InvoicePeriod invoicePeriod) {
    this.invoicePeriod = invoicePeriod;
    return this;
  }

   /**
   * The period during which the services or goods were delivered
   * @return invoicePeriod
  **/
  @ApiModelProperty(value = "The period during which the services or goods were delivered")
  public InvoicePeriod getInvoicePeriod() {
    return invoicePeriod;
  }

  public void setInvoicePeriod(InvoicePeriod invoicePeriod) {
    this.invoicePeriod = invoicePeriod;
  }

  public Invoice deliveryInformation(DeliveryInformation deliveryInformation) {
    this.deliveryInformation = deliveryInformation;
    return this;
  }

   /**
   * Information about the delivery BG-13 in XRechnung
   * @return deliveryInformation
  **/
  @ApiModelProperty(value = "Information about the delivery BG-13 in XRechnung")
  public DeliveryInformation getDeliveryInformation() {
    return deliveryInformation;
  }

  public void setDeliveryInformation(DeliveryInformation deliveryInformation) {
    this.deliveryInformation = deliveryInformation;
  }

  public Invoice totals(InvoiceTotals totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Totals for the invoice
   * @return totals
  **/
  @ApiModelProperty(value = "Totals for the invoice")
  public InvoiceTotals getTotals() {
    return totals;
  }

  public void setTotals(InvoiceTotals totals) {
    this.totals = totals;
  }

  public Invoice paymentInstructions(PaymentInstructions paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

   /**
   * Instructions how to perform the payment
   * @return paymentInstructions
  **/
  @ApiModelProperty(value = "Instructions how to perform the payment")
  public PaymentInstructions getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(PaymentInstructions paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public Invoice documents(List<SupportingDocument> documents) {
    this.documents = documents;
    return this;
  }

  public Invoice addDocumentsItem(SupportingDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Attached documents to the invoice
   * @return documents
  **/
  @ApiModelProperty(value = "Attached documents to the invoice")
  public List<SupportingDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(List<SupportingDocument> documents) {
    this.documents = documents;
  }

  public Invoice vatBreakdown(List<VatBreakdown> vatBreakdown) {
    this.vatBreakdown = vatBreakdown;
    return this;
  }

  public Invoice addVatBreakdownItem(VatBreakdown vatBreakdownItem) {
    if (this.vatBreakdown == null) {
      this.vatBreakdown = new ArrayList<>();
    }
    this.vatBreakdown.add(vatBreakdownItem);
    return this;
  }

   /**
   * This is used to list VAT by category, e.g. for invoices where parts are in different VAT categories
   * @return vatBreakdown
  **/
  @ApiModelProperty(value = "This is used to list VAT by category, e.g. for invoices where parts are in different VAT categories")
  public List<VatBreakdown> getVatBreakdown() {
    return vatBreakdown;
  }

  public void setVatBreakdown(List<VatBreakdown> vatBreakdown) {
    this.vatBreakdown = vatBreakdown;
  }

  public Invoice allowances(List<InvoiceAllowance> allowances) {
    this.allowances = allowances;
    return this;
  }

  public Invoice addAllowancesItem(InvoiceAllowance allowancesItem) {
    if (this.allowances == null) {
      this.allowances = new ArrayList<>();
    }
    this.allowances.add(allowancesItem);
    return this;
  }

   /**
   * Allowances / deductions on the invoice
   * @return allowances
  **/
  @ApiModelProperty(value = "Allowances / deductions on the invoice")
  public List<InvoiceAllowance> getAllowances() {
    return allowances;
  }

  public void setAllowances(List<InvoiceAllowance> allowances) {
    this.allowances = allowances;
  }

  public Invoice charges(List<InvoiceCharge> charges) {
    this.charges = charges;
    return this;
  }

  public Invoice addChargesItem(InvoiceCharge chargesItem) {
    if (this.charges == null) {
      this.charges = new ArrayList<>();
    }
    this.charges.add(chargesItem);
    return this;
  }

   /**
   * Charges / additional costs on the invoice
   * @return charges
  **/
  @ApiModelProperty(value = "Charges / additional costs on the invoice")
  public List<InvoiceCharge> getCharges() {
    return charges;
  }

  public void setCharges(List<InvoiceCharge> charges) {
    this.charges = charges;
  }

  public Invoice lineItems(List<InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Invoice addLineItemsItem(InvoiceLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Single line items in the invoice
   * @return lineItems
  **/
  @ApiModelProperty(value = "Single line items in the invoice")
  public List<InvoiceLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<InvoiceLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public Invoice sourceType(SourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The source type from which the invoice was created
   * @return sourceType
  **/
  @ApiModelProperty(required = true, value = "The source type from which the invoice was created")
  public SourceType getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceType sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.invoiceNumber, invoice.invoiceNumber) &&
        Objects.equals(this.invoiceDate, invoice.invoiceDate) &&
        Objects.equals(this.invoiceType, invoice.invoiceType) &&
        Objects.equals(this.currencyCode, invoice.currencyCode) &&
        Objects.equals(this.paymentDueDate, invoice.paymentDueDate) &&
        Objects.equals(this.references, invoice.references) &&
        Objects.equals(this.paymentTerms, invoice.paymentTerms) &&
        Objects.equals(this.previousInvoices, invoice.previousInvoices) &&
        Objects.equals(this.buyer, invoice.buyer) &&
        Objects.equals(this.seller, invoice.seller) &&
        Objects.equals(this.payee, invoice.payee) &&
        Objects.equals(this.invoiceNotes, invoice.invoiceNotes) &&
        Objects.equals(this.invoicePeriod, invoice.invoicePeriod) &&
        Objects.equals(this.deliveryInformation, invoice.deliveryInformation) &&
        Objects.equals(this.totals, invoice.totals) &&
        Objects.equals(this.paymentInstructions, invoice.paymentInstructions) &&
        Objects.equals(this.documents, invoice.documents) &&
        Objects.equals(this.vatBreakdown, invoice.vatBreakdown) &&
        Objects.equals(this.allowances, invoice.allowances) &&
        Objects.equals(this.charges, invoice.charges) &&
        Objects.equals(this.lineItems, invoice.lineItems) &&
        Objects.equals(this.sourceType, invoice.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, invoiceDate, invoiceType, currencyCode, paymentDueDate, references, paymentTerms, previousInvoices, buyer, seller, payee, invoiceNotes, invoicePeriod, deliveryInformation, totals, paymentInstructions, documents, vatBreakdown, allowances, charges, lineItems, sourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceType: ").append(toIndentedString(invoiceType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    paymentDueDate: ").append(toIndentedString(paymentDueDate)).append("\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    paymentTerms: ").append(toIndentedString(paymentTerms)).append("\n");
    sb.append("    previousInvoices: ").append(toIndentedString(previousInvoices)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    invoiceNotes: ").append(toIndentedString(invoiceNotes)).append("\n");
    sb.append("    invoicePeriod: ").append(toIndentedString(invoicePeriod)).append("\n");
    sb.append("    deliveryInformation: ").append(toIndentedString(deliveryInformation)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    vatBreakdown: ").append(toIndentedString(vatBreakdown)).append("\n");
    sb.append("    allowances: ").append(toIndentedString(allowances)).append("\n");
    sb.append("    charges: ").append(toIndentedString(charges)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

