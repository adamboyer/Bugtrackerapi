//package com.adamboyer.bugtracker;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.hateoas.CollectionModel;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.web.bind.annotation.*;
//
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
//
//@RestController
//public class EmployeeController {
////    private final EmployeeRepository repository;
//    //private final EmployeeModelAssembler assembler;
//    private final TicketRepository ticketRepository;
//
//    EmployeeController( TicketRepository ticketRepository) {
//        //this.repository = repository;
//        //this.assembler = assembler;
//        this.ticketRepository = ticketRepository;
//    }
//
//    // Aggregate root
//    // tag::get-aggregate-root[]
////    @GetMapping("/employees")
////    List<Employee> all() {
////        return repository.findAll();
////    }
////    @GetMapping("/employees")
////    CollectionModel<EntityModel<Employee>> all() {
////
////        List<EntityModel<Employee>> employees = repository.findAll().stream()
////                .map(employee -> EntityModel.of(employee,
////                        linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
////                        linkTo(methodOn(EmployeeController.class).all()).withRel("employees")))
////                .collect(Collectors.toList());
////
////        return CollectionModel.of(employees, linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
////    }
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping("/tickets")
//    List<Ticket> allTickets() {
//        return ticketRepository.findAll();
//    }
//
//   //This was the latest version !!!!
////    @CrossOrigin(origins = "http://localhost:3000")
////    @GetMapping("/employees")
////    CollectionModel<EntityModel<Employee>> all() {
////
////        List<EntityModel<Employee>> employees = repository.findAll().stream() //
////                .map(assembler::toModel) //
////                .collect(Collectors.toList());
////
////        return CollectionModel.of(employees, linkTo(methodOn(EmployeeController.class).all()).withSelfRel());
////    }
//    // end::get-aggregate-root[]
////    @CrossOrigin(origins = "http://localhost:3000")
////    @PostMapping("/employees")
////    Employee newEmployee(@RequestBody Employee newEmployee) {
////        return repository.save(newEmployee);
////    }
//
//
//    @CrossOrigin(origins = "http://localhost:3000")
//    @PostMapping("/tickets")
//    Ticket newTicket(@RequestBody Ticket newTicket) {
//        return ticketRepository.save(newTicket);
//    }
//
//
//    // Single Item
//
////    @GetMapping("/employees/{id}")
////    Employee one(@PathVariable Long id) {
////        return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
////    }
//
////    @GetMapping("/employees/{id}")
////    EntityModel<Employee> one(@PathVariable Long id) {
////
////        Employee employee = repository.findById(id) //
////                .orElseThrow(() -> new EmployeeNotFoundException(id));
////
////        return EntityModel.of(employee, //
////                linkTo(methodOn(EmployeeController.class).one(id)).withSelfRel(),
////                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
////    }
//
//    //This was the latest version
////    @CrossOrigin(origins = "http://localhost:3000")
////    @GetMapping("/employees/{id}")
////    EntityModel<Employee> one(@PathVariable Long id) {
////
////        Employee employee = repository.findById(id) //
////                .orElseThrow(() -> new EmployeeNotFoundException(id));
////
////        return assembler.toModel(employee);
////    }
////
////    @CrossOrigin(origins = "http://localhost:3000")
////    @PutMapping("/employees/{id}")
////    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
////        return repository.findById(id).map(employee -> {
////            employee.setName(newEmployee.getName());
////            employee.setRole(newEmployee.getRole());
////            return repository.save(employee);
////        }).orElseGet(() -> {
////            newEmployee.setId(id);
////            return repository.save(newEmployee);
////        });
////    }
////
////    @CrossOrigin(origins = "http://localhost:3000")
////    @DeleteMapping("/employees/{id}")
////    void deleteEmployee(@PathVariable Long id) {
////        repository.deleteById(id);
////    }
//}
