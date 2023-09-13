function handleSubmit(event) {
    event.preventDefault();

    const data = new FormData(event.target);

    const value = Object.fromEntries(data.entries());

    console.log({ value });

    const loginData = JSON.stringify(value);

    const blob = new Blob([loginData], { type: 'application/json' });

    const url = URL.createObjectURL(blob);

    const a = document.createElement('a');
    a.href = url;
    a.download = 'loginData.json';
    a.style.display = 'none';

    document.body.appendChild(a);
    a.click();

    URL.revokeObjectURL(url);
}

document.addEventListener('DOMContentLoaded', function () {
    const form = document.querySelector('#login');
    form.addEventListener('submit', handleSubmit);
});