package fr.portfolio.helloapirest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import fr.portfolio.helloapirest.controller.EmployeesController;
import fr.portfolio.helloapirest.service.EmployeesService;

@WebMvcTest(controllers = EmployeesController.class)
public class EmployeesControllerTest 
{
	@Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeesService employeeService;

    @Test
    public void testGetEmployees() throws Exception 
    {
        mockMvc.perform(get("/employees")).andExpect(status().isOk());
    }
}
