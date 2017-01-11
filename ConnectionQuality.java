public enum ConnectionQuality {
    // Bandwidth < 150 kbps.
    POOR,

    // 150 <= Bandwidth < 550 kbps.
    MODERATE,

    // 550 <= Bandwidth < 2000 kbps.
    GOOD,

    // Bandwidth >= 2000 kbps.
    EXCELLENT,

    // Placeholder for unknown bandwidth.
    // Initial state
    UNKNOWN
}
