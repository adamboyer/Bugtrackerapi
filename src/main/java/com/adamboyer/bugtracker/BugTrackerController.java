
package com.adamboyer.bugtracker;

        import java.util.List;
        import java.util.stream.Collectors;

//        import com.adamboyer.bugtracker.models.AthenticationResponse;
//        import com.adamboyer.bugtracker.models.AuthenicationRequest;
        import net.minidev.json.JSONObject;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.CrossOrigin;
        import org.springframework.hateoas.CollectionModel;
        import org.springframework.hateoas.EntityModel;
        import org.springframework.web.bind.annotation.*;

        import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
        import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class BugTrackerController {
    private final TicketRepository ticketRepository;
    private final ProjectRepository projectRepository;

//    @Autowired
//    private AuthenticationManager authenticationManager;

//    @Autowired
//    private MyUserDetailsService userDetailsService;

//    @Autowired
//    private JWTUtil jwtTokenUtil;

    BugTrackerController(TicketRepository ticketRepository, ProjectRepository projectRepository) {
        //this.repository = repository;
        //this.assembler = assembler;
        this.ticketRepository = ticketRepository;
        this.projectRepository = projectRepository;
    }

//    // Authentication Endpoint
//    @CrossOrigin(origins = "http://localhost:3000")
//    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenicationRequest authenicationRequest) throws Exception {
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(authenicationRequest.getUsername(), authenicationRequest.getPassword())
//            );
//        } catch (BadCredentialsException e) {
//            throw new Exception("Incorrect username or password", e);
//        }
//        final UserDetails userDetails = userDetailsService
//                .loadUserByUsername(authenicationRequest.getUsername());
//        final String jwt = jwtTokenUtil.generateToken(userDetails);
//
//        return ResponseEntity.ok(new AthenticationResponse(jwt));
//    }


    // Ticket Endpoints
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/tickets")
    List<Ticket> allTickets() {
        return ticketRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/tickets")
    JSONObject newTicket(@RequestBody Ticket newTicket)
    {
        Ticket ticket = ticketRepository.save(newTicket);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("ticket_id",ticket.getId());
        return jsonObj;
    }

    // Project Endpoints
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/projects")
    JSONObject newProject(@RequestBody Project newProject)
    {
        Project project = projectRepository.save(newProject);
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("project_id",project.getId());
        return jsonObj;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/projects")
    List<Project> allProjects() {
        return projectRepository.findAll();
    }

}

