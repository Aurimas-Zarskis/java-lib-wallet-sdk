package com.paysera.sdk.wallet.entities.card;

import com.paysera.sdk.wallet.moshi.Anotations.DateUnixTimestamp;
import com.paysera.sdk.wallet.entities.CommissionRule;
import com.squareup.moshi.Json;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Card {
    private static final String STATUS_RELATED = "related";

    protected Integer id;
    @Json(name = "user_id")
    private Integer userId;
    protected String status;
    @DateUnixTimestamp
    @Json(name = "related_at")
    private Date relatedAt;
    private CardRelation relation;
    @Json(name = "card_data")
    protected CardData data;
    private List<CardAccount> accounts = new ArrayList<>();
    @Json(name = "commission_rule")
    private CommissionRule commissionRule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRelatedAt() {
        return relatedAt;
    }

    public void setRelatedAt(Date relatedAt) {
        this.relatedAt = relatedAt;
    }

    public CardRelation getRelation() {
        return relation;
    }

    public void setRelation(CardRelation relation) {
        this.relation = relation;
    }

    public CardData getData() {
        return data;
    }

    public void setData(CardData data) {
        this.data = data;
    }

    public List<CardAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<CardAccount> accounts) {
        this.accounts.clear();
        this.accounts.addAll(accounts);
    }

    public CommissionRule getCommissionRule() {
        return commissionRule;
    }

    public void setCommissionRule(CommissionRule commissionRule) {
        this.commissionRule = commissionRule;
    }

    public boolean isRelated() {
        return this.status != null && this.status.equals(STATUS_RELATED);
    }
}
