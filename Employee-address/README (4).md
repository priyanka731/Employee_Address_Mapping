
# Employee Address Mapping
## Language and Framwork
* Java 
* SpringBoot 

## dependencies
* JPA  
* MYSQL database 
* Swagger UI
## Data Flow
### Controller
 ### Api's for Address (AddressController)
  * getAllAddress()
  * getAddressByUserid
  * addAddress()
  * DeleteAddressById()
  * UpdateAddress()

 ###  Api's for Employee (EmployeeController)
  * addEmployee()
  * updateEmployee()
  * deleteEmployee()
  * getEmployeebyId()
  * getAllEmployee()
### Service (AdressService.java , EmployeeService.java )
 
  * getAllAddress()
  * getAddressByEmpid
  * addAddress()
  * DeleteAddressById()
  * UpdateAddress()

 ### Service for (EmployeeController)
  * addEmployee()
  * updateEmployee()
  * deleteEmployee()
  * getEmployeebyId()
  * getAllEmployee()
### Model
 * Address()
 * Employee()
### Repository
 * IAddressRepo()
 * IEmployeeRepo()
### Data Structure Used
 * MYSQL as database
### Project Summary
Employee Address is a system to handle activities related to Employee and Address and services.

### Features for Employee
* Add/Create Employee.
* Get all Employee details.
* Get specific Employee details b Employee id.
* Update specific Employee details 
* Contact by Employee id.
* Delete/Remove specific Employee 

### Features for Address
* Add/Create Address.
* Get all Address details.
* Get specific Address details by Address id.
* Update specific Address details/Contact by Address id.
*  Delete/Remove specific Address details/Contact by Address id.