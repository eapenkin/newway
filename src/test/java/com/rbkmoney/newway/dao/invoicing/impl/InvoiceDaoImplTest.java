package com.rbkmoney.newway.dao.invoicing.impl;

import com.rbkmoney.newway.AbstractIntegrationTest;
import com.rbkmoney.newway.dao.invoicing.iface.InvoiceDao;
import com.rbkmoney.newway.domain.tables.pojos.Invoice;
import com.rbkmoney.newway.poller.event_stock.InvoicingEventStockHandler;
import com.rbkmoney.newway.util.HashUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import static io.github.benas.randombeans.api.EnhancedRandom.random;
import static org.junit.Assert.*;

public class InvoiceDaoImplTest extends AbstractIntegrationTest {

    @Autowired
    private InvoiceDao invoiceDao;

    @Value("${bm.invoicing.workersCount}") int workersCount;

    @Test
    public void test() {
        Invoice invoice = random(Invoice.class);
        invoice.setCurrent(true);
        Long invId = invoiceDao.save(invoice);
        Invoice invoiceGet = invoiceDao.get(invoice.getInvoiceId());
        assertEquals(invoice, invoiceGet);
        invoiceDao.updateNotCurrent(invoice.getInvoiceId());
        assertEquals(invoiceDao.getLastEventId(workersCount, HashUtil.getIntHash(invoice.getInvoiceId()) % workersCount), invoice.getEventId());
    }
}