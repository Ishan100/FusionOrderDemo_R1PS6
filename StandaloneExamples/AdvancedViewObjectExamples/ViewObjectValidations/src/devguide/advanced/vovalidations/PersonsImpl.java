package devguide.advanced.vovalidations;

import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ValidationException;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Aug 01 22:35:29 CDT 2010
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class PersonsImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        PersonId {
            public Object get(PersonsImpl obj) {
                return obj.getPersonId();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setPersonId((Number)value);
            }
        }
        ,
        PrincipalName {
            public Object get(PersonsImpl obj) {
                return obj.getPrincipalName();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setPrincipalName((String)value);
            }
        }
        ,
        Title {
            public Object get(PersonsImpl obj) {
                return obj.getTitle();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setTitle((String)value);
            }
        }
        ,
        FirstName {
            public Object get(PersonsImpl obj) {
                return obj.getFirstName();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setFirstName((String)value);
            }
        }
        ,
        LastName {
            public Object get(PersonsImpl obj) {
                return obj.getLastName();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setLastName((String)value);
            }
        }
        ,
        PersonTypeCode {
            public Object get(PersonsImpl obj) {
                return obj.getPersonTypeCode();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setPersonTypeCode((String)value);
            }
        }
        ,
        SupplierId {
            public Object get(PersonsImpl obj) {
                return obj.getSupplierId();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setSupplierId((Number)value);
            }
        }
        ,
        ProvisionedFlag {
            public Object get(PersonsImpl obj) {
                return obj.getProvisionedFlag();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setProvisionedFlag((String)value);
            }
        }
        ,
        PrimaryAddressId {
            public Object get(PersonsImpl obj) {
                return obj.getPrimaryAddressId();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setPrimaryAddressId((Number)value);
            }
        }
        ,
        RegisteredDate {
            public Object get(PersonsImpl obj) {
                return obj.getRegisteredDate();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setRegisteredDate((Date)value);
            }
        }
        ,
        MembershipId {
            public Object get(PersonsImpl obj) {
                return obj.getMembershipId();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setMembershipId((Number)value);
            }
        }
        ,
        Email {
            public Object get(PersonsImpl obj) {
                return obj.getEmail();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setEmail((String)value);
            }
        }
        ,
        ConfirmedEmail {
            public Object get(PersonsImpl obj) {
                return obj.getConfirmedEmail();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setConfirmedEmail((String)value);
            }
        }
        ,
        PhoneNumber {
            public Object get(PersonsImpl obj) {
                return obj.getPhoneNumber();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setPhoneNumber((String)value);
            }
        }
        ,
        MobilePhoneNumber {
            public Object get(PersonsImpl obj) {
                return obj.getMobilePhoneNumber();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setMobilePhoneNumber((String)value);
            }
        }
        ,
        CreditLimit {
            public Object get(PersonsImpl obj) {
                return obj.getCreditLimit();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setCreditLimit((Number)value);
            }
        }
        ,
        DateOfBirth {
            public Object get(PersonsImpl obj) {
                return obj.getDateOfBirth();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setDateOfBirth((Date)value);
            }
        }
        ,
        MaritalStatusCode {
            public Object get(PersonsImpl obj) {
                return obj.getMaritalStatusCode();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setMaritalStatusCode((String)value);
            }
        }
        ,
        Gender {
            public Object get(PersonsImpl obj) {
                return obj.getGender();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setGender((String)value);
            }
        }
        ,
        ChildrenUnder18 {
            public Object get(PersonsImpl obj) {
                return obj.getChildrenUnder18();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setChildrenUnder18((Number)value);
            }
        }
        ,
        ApproximateIncome {
            public Object get(PersonsImpl obj) {
                return obj.getApproximateIncome();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setApproximateIncome((Number)value);
            }
        }
        ,
        ContactMethodCode {
            public Object get(PersonsImpl obj) {
                return obj.getContactMethodCode();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setContactMethodCode((String)value);
            }
        }
        ,
        ContactableFlag {
            public Object get(PersonsImpl obj) {
                return obj.getContactableFlag();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setContactableFlag((String)value);
            }
        }
        ,
        ContactByAffilliatesFlag {
            public Object get(PersonsImpl obj) {
                return obj.getContactByAffilliatesFlag();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setContactByAffilliatesFlag((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(PersonsImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(PersonsImpl obj) {
                return obj.getCreationDate();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(PersonsImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(PersonsImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        ObjectVersionId {
            public Object get(PersonsImpl obj) {
                return obj.getObjectVersionId();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setObjectVersionId((Number)value);
            }
        }
        ,
        PersonsValidatorVO {
            public Object get(PersonsImpl obj) {
                return obj.getPersonsValidatorVO();
            }

            public void put(PersonsImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(PersonsImpl object);

        public abstract void put(PersonsImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int PRINCIPALNAME = AttributesEnum.PrincipalName.index();
    public static final int TITLE = AttributesEnum.Title.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int PERSONTYPECODE = AttributesEnum.PersonTypeCode.index();
    public static final int SUPPLIERID = AttributesEnum.SupplierId.index();
    public static final int PROVISIONEDFLAG = AttributesEnum.ProvisionedFlag.index();
    public static final int PRIMARYADDRESSID = AttributesEnum.PrimaryAddressId.index();
    public static final int REGISTEREDDATE = AttributesEnum.RegisteredDate.index();
    public static final int MEMBERSHIPID = AttributesEnum.MembershipId.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int CONFIRMEDEMAIL = AttributesEnum.ConfirmedEmail.index();
    public static final int PHONENUMBER = AttributesEnum.PhoneNumber.index();
    public static final int MOBILEPHONENUMBER = AttributesEnum.MobilePhoneNumber.index();
    public static final int CREDITLIMIT = AttributesEnum.CreditLimit.index();
    public static final int DATEOFBIRTH = AttributesEnum.DateOfBirth.index();
    public static final int MARITALSTATUSCODE = AttributesEnum.MaritalStatusCode.index();
    public static final int GENDER = AttributesEnum.Gender.index();
    public static final int CHILDRENUNDER18 = AttributesEnum.ChildrenUnder18.index();
    public static final int APPROXIMATEINCOME = AttributesEnum.ApproximateIncome.index();
    public static final int CONTACTMETHODCODE = AttributesEnum.ContactMethodCode.index();
    public static final int CONTACTABLEFLAG = AttributesEnum.ContactableFlag.index();
    public static final int CONTACTBYAFFILLIATESFLAG = AttributesEnum.ContactByAffilliatesFlag.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();
    public static final int PERSONSVALIDATORVO = AttributesEnum.PersonsValidatorVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public PersonsImpl() {
    }

    /**
     * Gets the attribute value for PersonId, using the alias name PersonId.
     * @return the PersonId
     */
    public Number getPersonId() {
        return (Number)getAttributeInternal(PERSONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PersonId.
     * @param value value to set the PersonId
     */
    public void setPersonId(Number value) {
        setAttributeInternal(PERSONID, value);
    }

    /**
     * Gets the attribute value for PrincipalName, using the alias name PrincipalName.
     * @return the PrincipalName
     */
    public String getPrincipalName() {
        return (String)getAttributeInternal(PRINCIPALNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrincipalName.
     * @param value value to set the PrincipalName
     */
    public void setPrincipalName(String value) {
        setAttributeInternal(PRINCIPALNAME, value);
    }

    /**
     * Gets the attribute value for Title, using the alias name Title.
     * @return the Title
     */
    public String getTitle() {
        return (String)getAttributeInternal(TITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Title.
     * @param value value to set the Title
     */
    public void setTitle(String value) {
        setAttributeInternal(TITLE, value);
    }

    /**
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the FirstName
     */
    public String getFirstName() {
        return (String)getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the LastName
     */
    public String getLastName() {
        return (String)getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for PersonTypeCode, using the alias name PersonTypeCode.
     * @return the PersonTypeCode
     */
    public String getPersonTypeCode() {
        return (String)getAttributeInternal(PERSONTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for PersonTypeCode.
     * @param value value to set the PersonTypeCode
     */
    public void setPersonTypeCode(String value) {
        setAttributeInternal(PERSONTYPECODE, value);
    }

    /**
     * Gets the attribute value for SupplierId, using the alias name SupplierId.
     * @return the SupplierId
     */
    public Number getSupplierId() {
        return (Number)getAttributeInternal(SUPPLIERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierId.
     * @param value value to set the SupplierId
     */
    public void setSupplierId(Number value) {
        setAttributeInternal(SUPPLIERID, value);
    }

    /**
     * Gets the attribute value for ProvisionedFlag, using the alias name ProvisionedFlag.
     * @return the ProvisionedFlag
     */
    public String getProvisionedFlag() {
        return (String)getAttributeInternal(PROVISIONEDFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProvisionedFlag.
     * @param value value to set the ProvisionedFlag
     */
    public void setProvisionedFlag(String value) {
        setAttributeInternal(PROVISIONEDFLAG, value);
    }

    /**
     * Gets the attribute value for PrimaryAddressId, using the alias name PrimaryAddressId.
     * @return the PrimaryAddressId
     */
    public Number getPrimaryAddressId() {
        return (Number)getAttributeInternal(PRIMARYADDRESSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PrimaryAddressId.
     * @param value value to set the PrimaryAddressId
     */
    public void setPrimaryAddressId(Number value) {
        setAttributeInternal(PRIMARYADDRESSID, value);
    }

    /**
     * Gets the attribute value for RegisteredDate, using the alias name RegisteredDate.
     * @return the RegisteredDate
     */
    public Date getRegisteredDate() {
        return (Date)getAttributeInternal(REGISTEREDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegisteredDate.
     * @param value value to set the RegisteredDate
     */
    public void setRegisteredDate(Date value) {
        setAttributeInternal(REGISTEREDDATE, value);
    }

    /**
     * Gets the attribute value for MembershipId, using the alias name MembershipId.
     * @return the MembershipId
     */
    public Number getMembershipId() {
        return (Number)getAttributeInternal(MEMBERSHIPID);
    }

    /**
     * Sets <code>value</code> as the attribute value for MembershipId.
     * @param value value to set the MembershipId
     */
    public void setMembershipId(Number value) {
        setAttributeInternal(MEMBERSHIPID, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the Email
     */
    public String getEmail() {
        return (String)getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for ConfirmedEmail, using the alias name ConfirmedEmail.
     * @return the ConfirmedEmail
     */
    public String getConfirmedEmail() {
        return (String)getAttributeInternal(CONFIRMEDEMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for ConfirmedEmail.
     * @param value value to set the ConfirmedEmail
     */
    public void setConfirmedEmail(String value) {
        setAttributeInternal(CONFIRMEDEMAIL, value);
    }

    /**
     * Gets the attribute value for PhoneNumber, using the alias name PhoneNumber.
     * @return the PhoneNumber
     */
    public String getPhoneNumber() {
        return (String)getAttributeInternal(PHONENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhoneNumber.
     * @param value value to set the PhoneNumber
     */
    public void setPhoneNumber(String value) {
        setAttributeInternal(PHONENUMBER, value);
    }

    /**
     * Gets the attribute value for MobilePhoneNumber, using the alias name MobilePhoneNumber.
     * @return the MobilePhoneNumber
     */
    public String getMobilePhoneNumber() {
        return (String)getAttributeInternal(MOBILEPHONENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for MobilePhoneNumber.
     * @param value value to set the MobilePhoneNumber
     */
    public void setMobilePhoneNumber(String value) {
        setAttributeInternal(MOBILEPHONENUMBER, value);
    }

    /**
     * Gets the attribute value for CreditLimit, using the alias name CreditLimit.
     * @return the CreditLimit
     */
    public Number getCreditLimit() {
        return (Number)getAttributeInternal(CREDITLIMIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreditLimit.
     * @param value value to set the CreditLimit
     */
    public void setCreditLimit(Number value) {
        setAttributeInternal(CREDITLIMIT, value);
    }

    /**
     * Gets the attribute value for DateOfBirth, using the alias name DateOfBirth.
     * @return the DateOfBirth
     */
    public Date getDateOfBirth() {
        return (Date)getAttributeInternal(DATEOFBIRTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for DateOfBirth.
     * @param value value to set the DateOfBirth
     */
    public void setDateOfBirth(Date value) {
        setAttributeInternal(DATEOFBIRTH, value);
    }

    /**
     * Gets the attribute value for MaritalStatusCode, using the alias name MaritalStatusCode.
     * @return the MaritalStatusCode
     */
    public String getMaritalStatusCode() {
        return (String)getAttributeInternal(MARITALSTATUSCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for MaritalStatusCode.
     * @param value value to set the MaritalStatusCode
     */
    public void setMaritalStatusCode(String value) {
        setAttributeInternal(MARITALSTATUSCODE, value);
    }

    /**
     * Gets the attribute value for Gender, using the alias name Gender.
     * @return the Gender
     */
    public String getGender() {
        return (String)getAttributeInternal(GENDER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Gender.
     * @param value value to set the Gender
     */
    public void setGender(String value) {
        setAttributeInternal(GENDER, value);
    }

    /**
     * Gets the attribute value for ChildrenUnder18, using the alias name ChildrenUnder18.
     * @return the ChildrenUnder18
     */
    public Number getChildrenUnder18() {
        return (Number)getAttributeInternal(CHILDRENUNDER18);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChildrenUnder18.
     * @param value value to set the ChildrenUnder18
     */
    public void setChildrenUnder18(Number value) {
        setAttributeInternal(CHILDRENUNDER18, value);
    }

    /**
     * Gets the attribute value for ApproximateIncome, using the alias name ApproximateIncome.
     * @return the ApproximateIncome
     */
    public Number getApproximateIncome() {
        return (Number)getAttributeInternal(APPROXIMATEINCOME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApproximateIncome.
     * @param value value to set the ApproximateIncome
     */
    public void setApproximateIncome(Number value) {
        setAttributeInternal(APPROXIMATEINCOME, value);
    }

    /**
     * Gets the attribute value for ContactMethodCode, using the alias name ContactMethodCode.
     * @return the ContactMethodCode
     */
    public String getContactMethodCode() {
        return (String)getAttributeInternal(CONTACTMETHODCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactMethodCode.
     * @param value value to set the ContactMethodCode
     */
    public void setContactMethodCode(String value) {
        setAttributeInternal(CONTACTMETHODCODE, value);
    }

    /**
     * Gets the attribute value for ContactableFlag, using the alias name ContactableFlag.
     * @return the ContactableFlag
     */
    public String getContactableFlag() {
        return (String)getAttributeInternal(CONTACTABLEFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactableFlag.
     * @param value value to set the ContactableFlag
     */
    public void setContactableFlag(String value) {
        setAttributeInternal(CONTACTABLEFLAG, value);
    }

    /**
     * Gets the attribute value for ContactByAffilliatesFlag, using the alias name ContactByAffilliatesFlag.
     * @return the ContactByAffilliatesFlag
     */
    public String getContactByAffilliatesFlag() {
        return (String)getAttributeInternal(CONTACTBYAFFILLIATESFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactByAffilliatesFlag.
     * @param value value to set the ContactByAffilliatesFlag
     */
    public void setContactByAffilliatesFlag(String value) {
        setAttributeInternal(CONTACTBYAFFILLIATESFLAG, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for ObjectVersionId, using the alias name ObjectVersionId.
     * @return the ObjectVersionId
     */
    public Number getObjectVersionId() {
        return (Number)getAttributeInternal(OBJECTVERSIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ObjectVersionId.
     * @param value value to set the ObjectVersionId
     */
    public void setObjectVersionId(Number value) {
        setAttributeInternal(OBJECTVERSIONID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * Gets the view accessor <code>RowSet</code> PersonsValidatorVO.
     */
    public RowSet getPersonsValidatorVO() {
        return (RowSet)getAttributeInternal(PERSONSVALIDATORVO);
    }

    /**
     * @param personId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number personId) {
        return new Key(new Object[]{personId});
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("devguide.advanced.vovalidations.Persons");
        }
        return mDefinitionObject;
    }


    @Override
    public void beforeCommit(TransactionEvent transactionEvent) throws ValidationException {
        String principalName = getPrincipalName();
        if (!validatePrincipalNameIsUniqueUsingViewAccessor(principalName)) {
          throw new ValidationException("Principal Name must be unique across person types");
        }
        super.beforeCommit(transactionEvent);
    }
    
  public boolean validatePrincipalNameIsUniqueUsingViewAccessor(String principalName) {
  RowSet rs = getPersonsValidatorVO();
  rs.setNamedWhereClauseParam("principalName", principalName);
  rs.setRangeSize(-1);
  rs.executeQuery();
  Row[] validatorRows = rs.getAllRowsInRange();
  if (validatorRows.length > 1)
    // more than one row has the same princpalName
  {
      return false;
  }
  rs.closeRowSetIterator();
  return true;
  }
}
