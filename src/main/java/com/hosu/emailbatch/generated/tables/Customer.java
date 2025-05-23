/*
 * This file is generated by jOOQ.
 */
package com.hosu.emailbatch.generated.tables;


import com.hosu.emailbatch.generated.Emailbatch;
import com.hosu.emailbatch.generated.Keys;
import com.hosu.emailbatch.generated.tables.records.CustomerRecord;

import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Customer extends TableImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>emailbatch.CUSTOMER</code>
     */
    public static final Customer CUSTOMER = new Customer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CustomerRecord> getRecordType() {
        return CustomerRecord.class;
    }

    /**
     * The column <code>emailbatch.CUSTOMER.id</code>.
     */
    public final TableField<CustomerRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>emailbatch.CUSTOMER.name</code>.
     */
    public final TableField<CustomerRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>emailbatch.CUSTOMER.email</code>.
     */
    public final TableField<CustomerRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>emailbatch.CUSTOMER.phone</code>.
     */
    public final TableField<CustomerRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>emailbatch.CUSTOMER.address</code>.
     */
    public final TableField<CustomerRecord, String> ADDRESS = createField(DSL.name("address"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>emailbatch.CUSTOMER.status</code>.
     */
    public final TableField<CustomerRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>emailbatch.CUSTOMER.created_at</code>.
     */
    public final TableField<CustomerRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>emailbatch.CUSTOMER.updated_at</code>.
     */
    public final TableField<CustomerRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "");

    private Customer(Name alias, Table<CustomerRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Customer(Name alias, Table<CustomerRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>emailbatch.CUSTOMER</code> table reference
     */
    public Customer(String alias) {
        this(DSL.name(alias), CUSTOMER);
    }

    /**
     * Create an aliased <code>emailbatch.CUSTOMER</code> table reference
     */
    public Customer(Name alias) {
        this(alias, CUSTOMER);
    }

    /**
     * Create a <code>emailbatch.CUSTOMER</code> table reference
     */
    public Customer() {
        this(DSL.name("CUSTOMER"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Emailbatch.EMAILBATCH;
    }

    @Override
    public Identity<CustomerRecord, Long> getIdentity() {
        return (Identity<CustomerRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CustomerRecord> getPrimaryKey() {
        return Keys.KEY_CUSTOMER_PRIMARY;
    }

    @Override
    public Customer as(String alias) {
        return new Customer(DSL.name(alias), this);
    }

    @Override
    public Customer as(Name alias) {
        return new Customer(alias, this);
    }

    @Override
    public Customer as(Table<?> alias) {
        return new Customer(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(String name) {
        return new Customer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Name name) {
        return new Customer(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Customer rename(Table<?> name) {
        return new Customer(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Condition condition) {
        return new Customer(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Customer where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Customer whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
