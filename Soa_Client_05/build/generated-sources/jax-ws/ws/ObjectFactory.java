
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCustomer_QNAME = new QName("http://ws/", "getCustomer");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://ws/", "getCustomerResponse");
    private final static QName _GetCustomers_QNAME = new QName("http://ws/", "getCustomers");
    private final static QName _GetCustomersResponse_QNAME = new QName("http://ws/", "getCustomersResponse");
    private final static QName _GetEmployee_QNAME = new QName("http://ws/", "getEmployee");
    private final static QName _GetEmployeeByName_QNAME = new QName("http://ws/", "getEmployeeByName");
    private final static QName _GetEmployeeByNameResponse_QNAME = new QName("http://ws/", "getEmployeeByNameResponse");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://ws/", "getEmployeeResponse");
    private final static QName _GetOrder_QNAME = new QName("http://ws/", "getOrder");
    private final static QName _GetOrderResponse_QNAME = new QName("http://ws/", "getOrderResponse");
    private final static QName _GetOrders_QNAME = new QName("http://ws/", "getOrders");
    private final static QName _GetOrdersResponse_QNAME = new QName("http://ws/", "getOrdersResponse");
    private final static QName _GetTruck_QNAME = new QName("http://ws/", "getTruck");
    private final static QName _GetTruckResponse_QNAME = new QName("http://ws/", "getTruckResponse");
    private final static QName _GetTrucks_QNAME = new QName("http://ws/", "getTrucks");
    private final static QName _GetTrucksResponse_QNAME = new QName("http://ws/", "getTrucksResponse");
    private final static QName _GetpriceAll_QNAME = new QName("http://ws/", "getpriceAll");
    private final static QName _GetpriceAllResponse_QNAME = new QName("http://ws/", "getpriceAllResponse");
    private final static QName _Getpricetofrom_QNAME = new QName("http://ws/", "getpricetofrom");
    private final static QName _GetpricetofromResponse_QNAME = new QName("http://ws/", "getpricetofromResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCustomer }
     * 
     */
    public GetCustomer createGetCustomer() {
        return new GetCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerResponse }
     * 
     */
    public GetCustomerResponse createGetCustomerResponse() {
        return new GetCustomerResponse();
    }

    /**
     * Create an instance of {@link GetCustomers }
     * 
     */
    public GetCustomers createGetCustomers() {
        return new GetCustomers();
    }

    /**
     * Create an instance of {@link GetCustomersResponse }
     * 
     */
    public GetCustomersResponse createGetCustomersResponse() {
        return new GetCustomersResponse();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link GetEmployeeByName }
     * 
     */
    public GetEmployeeByName createGetEmployeeByName() {
        return new GetEmployeeByName();
    }

    /**
     * Create an instance of {@link GetEmployeeByNameResponse }
     * 
     */
    public GetEmployeeByNameResponse createGetEmployeeByNameResponse() {
        return new GetEmployeeByNameResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetOrder }
     * 
     */
    public GetOrder createGetOrder() {
        return new GetOrder();
    }

    /**
     * Create an instance of {@link GetOrderResponse }
     * 
     */
    public GetOrderResponse createGetOrderResponse() {
        return new GetOrderResponse();
    }

    /**
     * Create an instance of {@link GetOrders }
     * 
     */
    public GetOrders createGetOrders() {
        return new GetOrders();
    }

    /**
     * Create an instance of {@link GetOrdersResponse }
     * 
     */
    public GetOrdersResponse createGetOrdersResponse() {
        return new GetOrdersResponse();
    }

    /**
     * Create an instance of {@link GetTruck }
     * 
     */
    public GetTruck createGetTruck() {
        return new GetTruck();
    }

    /**
     * Create an instance of {@link GetTruckResponse }
     * 
     */
    public GetTruckResponse createGetTruckResponse() {
        return new GetTruckResponse();
    }

    /**
     * Create an instance of {@link GetTrucks }
     * 
     */
    public GetTrucks createGetTrucks() {
        return new GetTrucks();
    }

    /**
     * Create an instance of {@link GetTrucksResponse }
     * 
     */
    public GetTrucksResponse createGetTrucksResponse() {
        return new GetTrucksResponse();
    }

    /**
     * Create an instance of {@link GetpriceAll }
     * 
     */
    public GetpriceAll createGetpriceAll() {
        return new GetpriceAll();
    }

    /**
     * Create an instance of {@link GetpriceAllResponse }
     * 
     */
    public GetpriceAllResponse createGetpriceAllResponse() {
        return new GetpriceAllResponse();
    }

    /**
     * Create an instance of {@link Getpricetofrom }
     * 
     */
    public Getpricetofrom createGetpricetofrom() {
        return new Getpricetofrom();
    }

    /**
     * Create an instance of {@link GetpricetofromResponse }
     * 
     */
    public GetpricetofromResponse createGetpricetofromResponse() {
        return new GetpricetofromResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link Truck }
     * 
     */
    public Truck createTruck() {
        return new Truck();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCustomer")
    public JAXBElement<GetCustomer> createGetCustomer(GetCustomer value) {
        return new JAXBElement<GetCustomer>(_GetCustomer_QNAME, GetCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCustomerResponse")
    public JAXBElement<GetCustomerResponse> createGetCustomerResponse(GetCustomerResponse value) {
        return new JAXBElement<GetCustomerResponse>(_GetCustomerResponse_QNAME, GetCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCustomers")
    public JAXBElement<GetCustomers> createGetCustomers(GetCustomers value) {
        return new JAXBElement<GetCustomers>(_GetCustomers_QNAME, GetCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCustomersResponse")
    public JAXBElement<GetCustomersResponse> createGetCustomersResponse(GetCustomersResponse value) {
        return new JAXBElement<GetCustomersResponse>(_GetCustomersResponse_QNAME, GetCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmployee")
    public JAXBElement<GetEmployee> createGetEmployee(GetEmployee value) {
        return new JAXBElement<GetEmployee>(_GetEmployee_QNAME, GetEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmployeeByName")
    public JAXBElement<GetEmployeeByName> createGetEmployeeByName(GetEmployeeByName value) {
        return new JAXBElement<GetEmployeeByName>(_GetEmployeeByName_QNAME, GetEmployeeByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmployeeByNameResponse")
    public JAXBElement<GetEmployeeByNameResponse> createGetEmployeeByNameResponse(GetEmployeeByNameResponse value) {
        return new JAXBElement<GetEmployeeByNameResponse>(_GetEmployeeByNameResponse_QNAME, GetEmployeeByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOrder")
    public JAXBElement<GetOrder> createGetOrder(GetOrder value) {
        return new JAXBElement<GetOrder>(_GetOrder_QNAME, GetOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOrderResponse")
    public JAXBElement<GetOrderResponse> createGetOrderResponse(GetOrderResponse value) {
        return new JAXBElement<GetOrderResponse>(_GetOrderResponse_QNAME, GetOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOrders")
    public JAXBElement<GetOrders> createGetOrders(GetOrders value) {
        return new JAXBElement<GetOrders>(_GetOrders_QNAME, GetOrders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getOrdersResponse")
    public JAXBElement<GetOrdersResponse> createGetOrdersResponse(GetOrdersResponse value) {
        return new JAXBElement<GetOrdersResponse>(_GetOrdersResponse_QNAME, GetOrdersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTruck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTruck")
    public JAXBElement<GetTruck> createGetTruck(GetTruck value) {
        return new JAXBElement<GetTruck>(_GetTruck_QNAME, GetTruck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTruckResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTruckResponse")
    public JAXBElement<GetTruckResponse> createGetTruckResponse(GetTruckResponse value) {
        return new JAXBElement<GetTruckResponse>(_GetTruckResponse_QNAME, GetTruckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrucks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTrucks")
    public JAXBElement<GetTrucks> createGetTrucks(GetTrucks value) {
        return new JAXBElement<GetTrucks>(_GetTrucks_QNAME, GetTrucks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrucksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTrucksResponse")
    public JAXBElement<GetTrucksResponse> createGetTrucksResponse(GetTrucksResponse value) {
        return new JAXBElement<GetTrucksResponse>(_GetTrucksResponse_QNAME, GetTrucksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetpriceAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getpriceAll")
    public JAXBElement<GetpriceAll> createGetpriceAll(GetpriceAll value) {
        return new JAXBElement<GetpriceAll>(_GetpriceAll_QNAME, GetpriceAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetpriceAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getpriceAllResponse")
    public JAXBElement<GetpriceAllResponse> createGetpriceAllResponse(GetpriceAllResponse value) {
        return new JAXBElement<GetpriceAllResponse>(_GetpriceAllResponse_QNAME, GetpriceAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getpricetofrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getpricetofrom")
    public JAXBElement<Getpricetofrom> createGetpricetofrom(Getpricetofrom value) {
        return new JAXBElement<Getpricetofrom>(_Getpricetofrom_QNAME, Getpricetofrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetpricetofromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getpricetofromResponse")
    public JAXBElement<GetpricetofromResponse> createGetpricetofromResponse(GetpricetofromResponse value) {
        return new JAXBElement<GetpricetofromResponse>(_GetpricetofromResponse_QNAME, GetpricetofromResponse.class, null, value);
    }

}
