import React, { useState } from "react";
import EmployeeService from "../services/EmployeeService";
import { useNavigate } from "react-router-dom";
import { Link } from "react-router-dom";
const AddEmployeeComponent = () => {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [emailId, setEmailId] = useState("");
  const navigate = useNavigate();
  const saveEmployee = (e) => {
    e.preventDefault(); //tells the user agent that if the event does not get explicitly handled, its default action should not be taken as it normally would be
    const employee = { firstName, lastName, emailId };
    EmployeeService.createEmployee(employee)
      .then((response) => {
        console.log(response.data);
        navigate("/employees");
      })
      .catch((error) => {
        console.log(error);
      });
  };
  return (
    <div>
      <br /> <br />
      <div className="container">
        <div className="row">
          <div className="card col-md-6 offset-md-3 offset-md-3">
            <h2 className="text-center"> Add Employee</h2>
            <div className="card-body">
              <form>
                <div className="form-group mb-2">
                  <label className="form-label"> First Name : </label>
                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter first name"
                    name="firstName"
                    value={firstName}
                    onChange={(e) => setFirstName(e.target.value)}
                  ></input>
                </div>
                <div className="form-group mb-2">
                  <label className="form-label"> Last Name : </label>
                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter last name"
                    name="lastName"
                    value={lastName}
                    onChange={(e) => setLastName(e.target.value)}
                  ></input>
                </div>
                <div className="form-group mb-2">
                  <label className="form-label"> Email Id : </label>
                  <input
                    type="text"
                    className="form-control"
                    placeholder="Enter Email id"
                    name="emailId"
                    value={emailId}
                    onChange={(e) => setEmailId(e.target.value)}
                  ></input>
                </div>
                <button
                  className="btn btn-success"
                  onClick={(e) => saveEmployee(e)}
                >
                  Save
                </button>
                <Link to="/employees" className="btn btn-danger">
                  Cancel
                </Link>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default AddEmployeeComponent;
