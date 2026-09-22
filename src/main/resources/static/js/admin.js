function ensureAdmin() {
  const token = localStorage.getItem("token");
  const role = localStorage.getItem("role");
  const username = localStorage.getItem("username");

  if (!token || !role || !role.includes("ADMIN")) {
    window.location.href = "/admin-login.html";
    return false;
  }

  document.getElementById("welcomeText").innerText = `Welcome, ${username}`;
  return true;
}

async function loadAdminData() {
  const token = localStorage.getItem("token");

  try {
    const response = await fetch("/admin/home", {
      headers: {
        "Authorization": "Bearer " + token
      }
    });

    const text = await response.text();
    document.getElementById("apiResult").innerText = text;

  } catch (error) {
    console.error("API error:", error);
    document.getElementById("apiResult").innerText = "Error loading data";
  }
}

function logout() {
  localStorage.removeItem("token");
  localStorage.removeItem("username");
  localStorage.removeItem("role");
  window.location.href = "/index.html";
}

document.addEventListener("DOMContentLoaded", ensureAdmin);
